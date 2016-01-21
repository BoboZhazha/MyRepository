package sdu.zhang.chat.server;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server extends JFrame {
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	
	private JButton jButton;
	
	private JPanel jPanel1;
	private JPanel jPanel2;
	
	private JScrollPane jScrollPanel;
	
	private JTextArea jTextArea1;
	
	private JTextField jTextField1;
	
	public Server(String name){
		super(name);
		this.initComponents();
	}
	// 初始化界面
	private void initComponents(){
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		
		jLabel1 = new JLabel();
		jLabel2 = new JLabel();
		jLabel3 = new JLabel();
		
		jTextField1 = new JTextField(10);
		jButton = new JButton();
		jScrollPanel = new JScrollPane();
		jTextArea1 = new JTextArea();
		
		jPanel1.setBorder(BorderFactory.createTitledBorder("服务器信息"));
		jPanel2.setBorder(BorderFactory.createTitledBorder("在线用户列表"));
		
		jLabel1.setText("服务器状态");
		jLabel2.setText("停止");
		jLabel3.setForeground(new Color(204,0,51));
		jLabel1.setText("端口号");
		
		jButton.setText("启动服务器");
		
		this.jTextArea1.setEditable(false);
		this.jTextArea1.setForeground(new Color(245,0,0));
		
		jPanel1.add(jLabel1);
		jPanel1.add(jLabel2);
		jPanel1.add(jLabel3);
		jPanel1.add(jTextField1);
		jPanel1.add(jButton);
		
		jTextArea1.setColumns(30);
		jTextArea1.setForeground(new Color(0,51,204));
		jTextArea1.setRows(20);
		
		jScrollPanel.setViewportView(jTextArea1);
		
		jPanel2.add(jScrollPanel);
		
		this.getContentPane().add(jPanel1,BorderLayout.NORTH);
		this.getContentPane().add(jPanel2,BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Server("服务器");
	}
	

}