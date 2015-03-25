package cn.gaily.frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class JtableTest extends JFrame{
	private static final long serialVersionUID = 1370517972015981669L;
	
	
	JTable table = new JTable();
	JScrollPane scrollPane = new JScrollPane();
	public JtableTest(){
		this.add(scrollPane);
		
		String[][] datas = new String[2][3];
		datas[0][0] = "a";
		datas[0][1] = "a";
		datas[0][2] = "a";
		datas[1][0] = "b";
		datas[1][1] = "b";
		datas[1][2] = "b";
		DefaultTableModel model = new DefaultTableModel(null, new String[]{"姓名","年龄","身份证号"}){
			@Override
			public boolean isCellEditable(int row, int column) {
				return super.isCellEditable(row, column);
			}
			
		};
		model.addRow(datas);
		table.setModel(model);
		scrollPane.add(table);
		scrollPane.setViewportView(table);
		this.setBounds(300, 400, 300, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		try{
	        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	        UIManager.put("RootPane.setupButtonVisible", false);
	    }catch(Exception e){
	    }
		JtableTest test = new JtableTest();
		test.setVisible(true);
	}
	
	
	
}
