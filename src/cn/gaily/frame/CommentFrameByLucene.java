package cn.gaily.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.util.Version;

import cn.gaily.pub.PubUtils;
import cn.gaily.pub.ResourceManager;

public class CommentFrameByLucene extends JFrame implements ActionListener {

	private static final long serialVersionUID = 3287395403573286755L;

	public JLabel 		username = new JLabel("用户名：");
	public JTextField 	usernameField = new JTextField(8);
	public JLabel 		password = new JLabel("密码：");
	public JTextField 	passwordField = new JTextField(5);
	public JLabel 		dbName = new JLabel("数据库名：");
	public JTextField 	dbNameField = new JTextField(8);
	public JLabel 	    ip = new JLabel("IP地址：");
	public JTextField   ipField = new JTextField(8);
	
	public JButton	    testConnectButton = new JButton("测试连接");
	public JButton	    transSqlButton = new JButton("翻译sql");
	public JTextArea	translatArea = new JTextArea(5,65);
	
	public Border 		border = BorderFactory.createLoweredBevelBorder();
	
	public JButton 		initButton = new JButton("初始化数据");
	public JButton 		setButton = new JButton("配置");
	
	public JLabel		queryLable = new JLabel("请输入：");
	public JTextField	queryText = new JTextField();
	
	public JLabel		setLabel =  new JLabel("自定义查询设置(默认无需设置)");
	public JTextArea 	setSqlArea = new JTextArea(5, 65);
	public JLabel		setTitle = new JLabel("设置表头名称(首列为“序号”,其它必须和sql查询字段对应,以‘,’分隔)：");
	public JTextField	setTitleField = new JTextField(38);
	
	public JLabel 		foldName = new JLabel("数据保存文件夹名称：");
	public JTextField   foldNameField = new JTextField(14);
	
	public JButton 		confirmButton = new JButton("确认配置");
	public JButton 		resetButton = new JButton("重置配置");
	
	public JTextArea 	hidArea = new JTextArea(10, 60);
	public JButton 		hidButton  = new JButton("保存");
	
	public JLabel 		copyRight = new JLabel("created by：Super_Emon 2014-08-24");
	
	
	String sql = "";
	String titles = "";
	
	GridLayout layout = new GridLayout(1,1);
	JPanel setPanel = null;
	JPanel transPanel = null;

	public static JScrollPane scrollPane = new JScrollPane();
	public static JTable table = new JTable();
	public static DefaultTableModel model = null;
	
	static String[][] datas = new String[0][0];
	static List<Vector<String>> list = new ArrayList<Vector<String>>();
	
	String suser = null;
	String spassword = null;
	String sip = null;
	String sdbName = null;
	static{
	}
	
	public CommentFrameByLucene() {
		this.setTitle("Super_Emon元数据助手1.0");
		this.setSize(new Dimension(850,600));
		this.setLocation(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image image;
		try {
			image = ImageIO.read(this.getClass().getResource("icon.png"));
			this.setIconImage(image);
		} catch (IOException e) {
			e.printStackTrace();
		}
		initUI();
	}

	private void initUI() {
		JPanel panel = new JPanel(layout);
		JPanel queryPanel = new JPanel();
		queryPanel.add(queryLable);
		queryPanel.add(queryText);
		queryPanel.add(setButton);
		queryPanel.add(transSqlButton);
		panel.add(queryPanel);
		
		setPanel = new JPanel();
		JPanel topPanel = new JPanel();
		transPanel = new JPanel();
		
		topPanel.add(username);
		topPanel.add(usernameField);
		topPanel.add(password);
		topPanel.add(passwordField);
		topPanel.add(dbName);
		topPanel.add(dbNameField);
		topPanel.add(ip);
		topPanel.add(ipField);
		topPanel.add(testConnectButton);
		topPanel.add(initButton);
		
		setPanel.setBorder(border);
		setPanel.add(topPanel,BorderLayout.NORTH);
		setPanel.add(setLabel,BorderLayout.NORTH);
		setPanel.add(setSqlArea,BorderLayout.NORTH);
		setPanel.add(setTitle,BorderLayout.NORTH);
		setPanel.add(setTitleField,BorderLayout.NORTH);
		setPanel.add(foldName,BorderLayout.NORTH);
		setPanel.add(foldNameField,BorderLayout.NORTH);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.add(confirmButton);
		buttonPanel.add(resetButton);
		setPanel.add(buttonPanel,BorderLayout.NORTH);

		setPanel.add(hidArea,BorderLayout.NORTH);
		setPanel.add(hidButton,BorderLayout.NORTH);
		hidArea.setVisible(false);
		hidButton.setVisible(false);
		
		transPanel.add(translatArea);
		transPanel.setBorder(border);
		
		this.add(panel, BorderLayout.NORTH);
		this.add(setPanel, BorderLayout.CENTER);
//		this.add(transPanel,BorderLayout.CENTER);
		transPanel.setVisible(false);
		setPanel.setVisible(false);
		this.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setVisible(true);
		
		setCompPrefrece(queryText, 500, Color.RED);
		setCompPrefrece(setTitleField, 50, null);
		setCompPrefrece(foldNameField, 0, null);
		setCompPrefrece(setLabel, 0, Color.LIGHT_GRAY);
		setCompPrefrece(setTitle, 0, Color.LIGHT_GRAY);
		
		setTitleField.setText("序号,");
		
		setSqlArea.setFont(new Font("宋体", Font.BOLD, 20));
		setSqlArea.setLineWrap(true);
		setSqlArea.setToolTipText("请输入需要配置的sql语句");
		translatArea.setFont(new Font("宋体", Font.BOLD, 20));
		translatArea.setLineWrap(true);
		translatArea.setEditable(false);
		
		table.setRowHeight(24);
		table.setBackground(Color.LIGHT_GRAY);
		table.setFont(new Font("宋体", Font.PLAIN, 14));
		table.setForeground(Color.BLACK);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e!=null &&e.getClickCount()==2){
					int row = table.rowAtPoint(e.getPoint());
					int column = table.columnAtPoint(e.getPoint());
					String keyword = (String) table.getModel().getValueAt(row, column);
					list = QueryServiceLucene.queryByKeyword(keyword, column);
					if(list!=null){
						refreshData();
					}
				}
			}
		});
		refreshData();
		
		hidArea.setLineWrap(true);
		
		Document doc = queryText.getDocument();
		doc.addDocumentListener(new QueryDocListener()); //输入监听
		testConnectButton.addActionListener(this);
		initButton.addActionListener(this);
		setButton.addActionListener(this);
		transSqlButton.addActionListener(this);
		confirmButton.addActionListener(this);
		resetButton.addActionListener(this);
		hidButton.addActionListener(this);
		username.setToolTipText("双击有惊喜！");
		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2){
					if(hidArea.isVisible()==false){
						String message = PubUtils.getProperty("HIDE_MESSAGE");
						if(PubUtils.isNotEmpty(message)){
							hidArea.setText(message);
						}
						hidArea.setVisible(true);
						hidButton.setVisible(true);
					}else{
						hidArea.setVisible(false);
						hidButton.setVisible(false);
					}
				}
			}
		});
		
		usernameField.setText(ResourceManager.DEFAULT_USERNAME);
		passwordField.setText(ResourceManager.DEFAULT_PASSWORD);
		ipField.setText(ResourceManager.DEFAULT_IP);
		dbNameField.setText(ResourceManager.DEFAULT_DBNAME);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * 测试连接
		 */
		if(e.getSource() ==testConnectButton){
			testConnectButton.setText("测试连接");
			suser = usernameField.getText().trim().toUpperCase();
			spassword = passwordField.getText().trim();
			sip = ipField.getText().trim();
			sdbName = dbNameField.getText().trim();
			boolean isConnect = QueryServiceLucene.testQuery(suser, spassword, sip, sdbName);
			if(isConnect){
				testConnectButton.setText("连接成功");
			}else{
				testConnectButton.setText("连接失败");
			}
		}
		/**
		 * 初始化数据
		 */
		if(e.getSource()==initButton){
			int response = JOptionPane.showConfirmDialog(this, "数据只需初始化一次即可，你确认还需继续初始化吗？", "提示", JOptionPane.YES_NO_OPTION	, JOptionPane.QUESTION_MESSAGE);
			if(response==1){
				return ;
			}else{
				suser = usernameField.getText().trim().toUpperCase();
				spassword = passwordField.getText().trim();
				sip = ipField.getText().trim();
				sdbName = dbNameField.getText().trim();
				boolean isInit = false;
				try {
					//默认创建的模糊查询索引, 模糊索引0, 精确索引1
					isInit = QueryServiceLucene.initQueryData(suser, spassword, sip, sdbName, 0);
				} catch (InstantiationException e1) {
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					e1.printStackTrace();
				} catch (IllegalArgumentException e1) {
					e1.printStackTrace();
				} catch (InvocationTargetException e1) {
					e1.printStackTrace();
				} catch (NoSuchMethodException e1) {
					e1.printStackTrace();
				} catch (SecurityException e1) {
					e1.printStackTrace();
				}
				if(isInit){
					initButton.setText("初始化成功");
//					initButton.setEnabled(false);
				}else{
					initButton.setText("初始化失败");
				}
			}
		}
		/**
		 * 设置界面
		 */
		if(e.getSource()==setButton){
			if(scrollPane.isVisible()){
				this.remove(scrollPane);
				scrollPane.setVisible(false);
				this.add(setPanel, BorderLayout.CENTER);
				setPanel.setVisible(true);
				setButton.setText("返回查询");
				transSqlButton.setText("翻译sql");
				
			}else if(transPanel.isVisible()){
				this.remove(transPanel);
				transPanel.setVisible(false);
				this.add(scrollPane, BorderLayout.CENTER);
				scrollPane.setVisible(true);
				setButton.setText("设置");
				transSqlButton.setText("翻译sql");
			}
			else if(setPanel.isVisible()){
				this.remove(setPanel);
				setPanel.setVisible(false);
				this.add(scrollPane,BorderLayout.CENTER);
				scrollPane.setVisible(true);
				setButton.setText("设置");
				transSqlButton.setText("翻译sql");
			}
		}
		/**
		 * 设置确认按钮
		 */
		if(e.getSource()==confirmButton){
			sql = setSqlArea.getText().toUpperCase();
			titles = setTitleField.getText().trim();
			if(PubUtils.isEmpty(sql)||PubUtils.isEmpty(titles)){
				JOptionPane.showMessageDialog(this, "输入不能为空！");
				return;
			}
			if(sql.contains("*")||sql.contains(";")||sql.contains("；")||sql.contains("，")||titles.contains("，")){
				JOptionPane.showMessageDialog(this, "语句中不能使用*, 必须明确定义字段, 并且不能含有'分号', 不能含有中文逗号！");
				return;
			}
			String str = sql.substring(0, sql.indexOf("FROM"));
			String[] fields = str.split(",");
			if(fields!=null&& fields.length>0){
				String[] tts = titles.split(ResourceManager.SPLIT_PREFIX);
				if(fields.length!=tts.length-1){
					JOptionPane.showMessageDialog(this, "SQL中字段和设置的表头数目不相符！！");
					return;
				}
			}
			String foldName = foldNameField.getText().trim();
			if(PubUtils.isNotEmpty(foldName)){
				PubUtils.setProperty("PATH", foldName);
			}
			
			int result = JOptionPane.showConfirmDialog(this, "设置完后，请重新初始化数据；如果设置出错，请点击重置设置按钮。你确定继续设置吗？", "提示", JOptionPane.YES_NO_OPTION);
			if(result==1){
				return ;
			}
			initButton.setText("初始化数据");
			PubUtils.setProperty("QUERY_COMMENT_SQL", sql);
			PubUtils.setProperty("COMMENT_TABLENAMES", titles);
			QueryServiceLucene.init();
			refreshData();
		}
		/**
		 * 重置按钮
		 */
		if(e.getSource()==resetButton){
			initButton.setText("初始化数据");
			setTitleField.setText("");
			setSqlArea.setText("");
			PubUtils.setProperty("COMMENT_TABLENAMES", ResourceManager.COMMENT_TABLENAMES);
			PubUtils.setProperty("QUERY_COMMENT_SQL", ResourceManager.QUERY_COMMENT_SQL);
			PubUtils.setProperty("PATH", ResourceManager.PATH);
			QueryServiceLucene.init();
			refreshData();
		}
		/**
		 * 隐藏按钮
		 */
		if(e.getSource()==hidButton){
			String message = hidArea.getText();
			if(message!=null && PubUtils.isNotEmpty(message)){
				PubUtils.setProperty("HIDE_MESSAGE", message);
			}
		}
		/**
		 * 翻译sql面板
		 */
		if(e.getSource()==transSqlButton){
			if(scrollPane.isVisible()){
				this.remove(scrollPane);
				scrollPane.setVisible(false);
				this.add(transPanel, BorderLayout.CENTER);
				transPanel.setVisible(true);
				setButton.setText("返回查询");
				transSqlButton.setText("返回");
			}else if(setPanel.isVisible()){
				this.remove(setPanel);
				setPanel.setVisible(false);
				this.add(transPanel, BorderLayout.CENTER);
				transPanel.setVisible(true);
				transSqlButton.setText("返回");
				setButton.setText("返回查询");
			}else{
				this.remove(transPanel);
				transPanel.setVisible(false);
				this.add(scrollPane, BorderLayout.CENTER);
				scrollPane.setVisible(true);
				transSqlButton.setText("翻译sql");
			}
		}
	}
	
	/**
	 * <p>方法名称：refreshData</p>
	 * <p>方法描述：刷新表格中数据</p>
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	public static void refreshData(){
		String COMMENT_TABLENAMES = PubUtils.getProperty("COMMENT_TABLENAMES");
		String[] columnNames = COMMENT_TABLENAMES.split(ResourceManager.SPLIT_PREFIX);
		if(columnNames!=null&& columnNames.length>0){
			model = new DefaultTableModel(datas, columnNames){
				@Override
				public boolean isCellEditable(int row, int column) {
					return false;
				}
			};
			if(list.size()>0){
				for(Vector<String> v: list){
					model.addRow(v);
				}
			}
			table.setModel(model);
			if(table.getColumnModel()!=null&&table.getColumnModel().getColumnCount()>0){
				table.getColumnModel().getColumn(0).setMaxWidth(40);
			}
			
//			table.setDefaultRenderer(columnClass, renderer)
			
			scrollPane.setViewportView(table);
			//恢复滚动条位置
			JScrollBar bar = scrollPane.getVerticalScrollBar();
			if(bar!=null){
				bar.setValue(bar.getMinimum());
			}
			
		}
	}
	
	/**
	 * <p>Title: QueryDocListener</P>
	 * <p>Description: 文本框实时输入监听</p>
	 * @author xiaoh
	 * @version 1.0
	 * @since 2014-8-24
	 */
	private class QueryDocListener implements DocumentListener{
		
		boolean fileExist = false;
		boolean show = true;
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			if(!fileExist){
				fileExist = checkFileExist();
				return;
			}
			String keyword = getString(e);
			show = showTab();
			if(show&&PubUtils.isNotEmpty(keyword)){
				list = QueryServiceLucene.queryAll(keyword);
				refreshData();
			}
			if(!show&&PubUtils.isNotEmpty(keyword)){
				//TODO translate sql
			}
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			if(!fileExist){
				fileExist = checkFileExist();
				return;
			}
			String keyword = getString(e);
			show = showTab();
			if(show&&PubUtils.isNotEmpty(keyword)){
				list = QueryServiceLucene.queryAll(keyword);
				refreshData();
			}
			if(!show&&PubUtils.isNotEmpty(keyword)){
				//TODO translate sql
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			if(!fileExist){
				fileExist = checkFileExist();
				return;
			}
			String keyword = getString(e);
			show = showTab();
			if(show&&PubUtils.isNotEmpty(keyword)){
				list = QueryServiceLucene.queryAll(keyword);
				refreshData();
			}
			if(!show&&PubUtils.isNotEmpty(keyword)){
				//TODO translate sql
			}
		}
		
		/**
		 * <p>方法名称：getString</p>
		 * <p>方法描述：获取输入框的值</p>
		 * @param e
		 * @author xiaoh
		 * @since  2014-8-27
		 * <p> history 2014-8-27 xiaoh  创建   <p>
		 */
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
	/**
	 * <p>方法名称：translatSql</p>
	 * <p>方法描述：翻译sql中有注释的字段</p>
	 * @param sql  SELECT  a.v_ajbh c,a.v_ajmc d,a.pk_org FROM crpas_gaj_ajxx_h a;
	 * @author xiaoh
	 * @since  2014-8-27
	 * <p> history 2014-8-27 xiaoh  创建   <p>
	 */
	private static String translatSql(String sql){
		if(PubUtils.isEmpty(sql)){
			return "";
		}
		
		System.out.println(sql);
		
		String[] fields = sql.substring(sql.indexOf("SELECT ")+6, sql.indexOf("FROM")).split(",");
		
		if(fields!=null && fields.length>0){
			for(String s : fields){
				System.out.println(s);
			}
		}
		return "";
	}
	
	
	/**
	 * <p>方法名称：checkFileExist</p>
	 * <p>方法描述：检查是否初始化</p>
	 * @return 
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	private boolean checkFileExist() {
		File file = new File(ResourceManager.INDEX_PATH);
		if(!file.exists()){
			JOptionPane.showMessageDialog(this, "请先初始化数据后查询！");
			return false;
		}
		return true;
	}
	
	/**
	 * <p>方法名称：showTab</p>
	 * <p>方法描述：显示查询界面</p>
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	private boolean showTab(){
		if(setPanel.isVisible()){
			setPanel.setVisible(false);
			this.add(scrollPane,BorderLayout.CENTER);
			scrollPane.setVisible(true);
			setButton.setText("设置");
			return true;
		}
		if(transPanel.isVisible()){
			return false;
		}
		return true;
	}
	
	/**
	 * <p>方法名称：setCompPrefrece</p>
	 * <p>方法描述：设置comp界面</p>
	 * @param comp
	 * @param length
	 * @param color
	 * @author xiaoh
	 * @since  2014-8-26
	 * <p> history 2014-8-26 xiaoh  创建   <p>
	 */
	private static void setCompPrefrece(JComponent comp, int length, Color color){
		if(comp instanceof JTextField){
			comp.setPreferredSize(new Dimension(length, 25));
		}
		comp.setFont(new Font("宋体",Font.BOLD, 20));
		if(color!=null){
			comp.setForeground(color);
		}
	}
	
	
	/**
	 * <p>方法名称：main</p>
	 * <p>方法描述：</p>
	 * @param args
	 * @author xiaoh
	 * @since  2014-8-24
	 * <p> history 2014-8-24 xiaoh  创建   <p>
	 */
	public static void main(String[] args) {
		//复制prop.properties文件到本地
		File propFile = new File(ResourceManager.savePath);
		if(!propFile.exists()){
			PubUtils.copyPropFileToLocal();
		}
		
		CommentFrameByLucene frame = new CommentFrameByLucene();
		frame.setVisible(true);
		
//		String[] keyword = new String[]{"SELECT","DISTINCT","FROM","WHERE"};
//		String sql ="SELECT DISTINCT a.v_ajbh a ,a.v_ajmc b ,a.pk_org c FROM crpas_gaj_ajxx_h a;";
//		translatSql(sql.toUpperCase());
		
	}

}
