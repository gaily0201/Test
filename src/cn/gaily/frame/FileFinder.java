package cn.gaily.frame;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import cn.gaily.pub.PubUtils;
import cn.gaily.pub.ResourceManager;

public class FileFinder extends JFrame implements ActionListener{
	private static final long serialVersionUID = -2664828163290579960L;

	JToolBar bar = new JToolBar();
	JMenu menu = new JMenu("文件");
	JScrollPane pane = new JScrollPane();
	JTable table = new JTable();
	JLabel label  = new JLabel("搜索");
	JTextField queryArea = new JTextField();
	JButton queryAction = new JButton("查询");
	JButton initAction = new JButton("更新");
	
	DefaultTableModel tableModel = null;
	String[] tableColumNames = new String[]{"文件名","路径"," 修改时间"};
	private String[][] datas = null; //保存数据
	static List<Vector<String>> list = new ArrayList<Vector<String>>();
	BuildFileIndexService service = new BuildFileIndexService();
	public FileFinder(){
		this.setBounds(300, 200, 1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initUI();
	}
	

	//初始化界面
	private void initUI() {
		table.addMouseListener(new MouseAdapter() {  //TODO
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e!=null &&e.getClickCount()==2){
					int row = table.rowAtPoint(e.getPoint());
					int column = table.columnAtPoint(e.getPoint());
					String keyword = (String) table.getModel().getValueAt(row, column);
					if(column==0){
						try {
							Desktop.getDesktop().open(new File((String) table.getModel().getValueAt(row, column+1)));
							return;
						} catch (IOException e1) {
							e1.printStackTrace();
						}
					}
					try {
						File file = new File(keyword);
						if(!file.isDirectory()){
							file = file.getParentFile();
						}
						Desktop.getDesktop().open(file);
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		JPanel topPanel = new JPanel();
		topPanel.add(label);
		Document doc = queryArea.getDocument();
		doc.addDocumentListener(new QueryDocListener()); //输入监听
		queryArea.setPreferredSize(new Dimension(200,30));
		topPanel.add(queryArea);
		queryAction.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
		initAction.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.lightBlue));
		queryAction.addActionListener(this);
		initAction.addActionListener(this);
		topPanel.add(queryAction);
		topPanel.add(initAction);
		bar.add(menu);
		initTable();
		pane.add(table);
		pane.setViewportView(table);
		this.add(topPanel,BorderLayout.NORTH);
		this.add(pane,BorderLayout.CENTER);
	}

	private void initTable() {
		tableModel = new DefaultTableModel(tableColumNames, 0){
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.setModel(tableModel);
	}

	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				try{
			        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			        UIManager.put("RootPane.setupButtonVisible", false);
			    }catch(Exception e){
			    }
				new FileFinder().setVisible(true);
			}
		});
	}


	Thread t = null;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==queryAction){
			
		}else if(e.getSource()==initAction){
			initData();
		}
	}

	
	private void initData(){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new BuildFileIndexService().buildIndex();
			}
		});
	}
	
	
	
	private class QueryDocListener implements DocumentListener{
		boolean fileExist = false;
		@Override
		public void insertUpdate(DocumentEvent e) {
			if(!fileExist){
				fileExist = checkFileExist();
				return;
			}
			String keyword = getString(e);
			if(PubUtils.isNotEmpty(keyword)){
				list = service.query(keyword);
				refreshData();
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			if(!fileExist){
				fileExist = checkFileExist();
				return;
			}
			String keyword = getString(e);
			if(PubUtils.isNotEmpty(keyword)){
				list = service.query(keyword);
				refreshData();
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			if(!fileExist){
				fileExist = checkFileExist();
				return;
			}
			String keyword = getString(e);
			if(PubUtils.isNotEmpty(keyword)){
				list = service.query(keyword);
				refreshData();
			}
		}
		
		private String getString(DocumentEvent e){
			Document doc = e.getDocument();
			if(doc.getLength()<0){
				return "";
			}
			String s = "";
			try {
				s = doc.getText(0, doc.getLength());
			} catch (BadLocationException e1) {
				e1.printStackTrace();
			}
			return s;
		}
	}
	
	private void refreshData(){
		String[] columnNames = new String[]{"名称","路径","最后修改时间"};
		if(columnNames!=null&& columnNames.length>0){
			tableModel = new DefaultTableModel(datas, columnNames){
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			if(list.size()>0){
				for(Vector<String> v: list){
					tableModel.addRow(v);
				}
			}
			table.setModel(tableModel);
			if(table.getColumnModel()!=null&&table.getColumnModel().getColumnCount()>0){
				table.getColumnModel().getColumn(0).setMinWidth(200);
				table.getColumnModel().getColumn(0).setMaxWidth(200);
				table.getColumnModel().getColumn(2).setMinWidth(100);
				table.getColumnModel().getColumn(2).setMaxWidth(100);
			}
			
			pane.setViewportView(table);
			JScrollBar bar = pane.getVerticalScrollBar();
			if(bar!=null){
				bar.setValue(bar.getMinimum());
			}
		}
	}
	
	
	private boolean checkFileExist() {
		File file = new File(ResourceManager.INDEX_PATH);
		if(!file.exists()){
			JOptionPane.showMessageDialog(this, "请先初始化数据后查询！");
			return false;
		}
		return true;
	}
	
	
	
	
}
