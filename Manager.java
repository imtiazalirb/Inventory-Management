import java.awt.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

public class Manager extends Frame implements WindowListener, ActionListener{
	private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
	private Panel panel;
	
	Manager(){
		
		super("Manager");
		addWindowListener(this);
		setSize(450,540);
		setLocation(600,0);
		panel = new Panel();
		panel.setLayout(null);
		
		Font f1 = new Font ("Helvetica", Font.BOLD, 15);
		Font f2 = new Font ("Helvetica", Font.BOLD, 13);
		
		bt1=new Button("My Profile");
		bt1.setFont(f2);
		bt1.setBounds(275,30,80,30);
		panel.add(bt1);
		bt1.addActionListener(this);
		
		bt2=new Button("Logout");
		bt2.setBounds(357,30,60,30);
		panel.add(bt2);
		bt2.setFont(f2);
		bt2.addActionListener(this);
		
		bt3=new Button("All Products");
		bt3.setFont(f1);
		bt3.setBounds(100,100,250,40);
		panel.add(bt3);
		bt3.addActionListener(this);

		bt4=new Button("Remove Product");
		bt4.setFont(f1);
		bt4.setBounds(100,150,250,40);
		panel.add(bt4);
		bt4.addActionListener(this);

		bt5=new Button("Add Product");
		bt5.setFont(f1);
		bt5.setBounds(100,200,250,40);
		panel.add(bt5);
		bt5.addActionListener(this);

		
		
		
		bt6=new Button("All Employee Info");
		bt6.setFont(f1);
		bt6.setBounds(100,250,250,40);
		panel.add(bt6);
		bt6.addActionListener(this);
		
		bt6=new Button("Add Employee");
		bt6.setFont(f1);
		bt6.setBounds(100,300,250,40);
		panel.add(bt6);
		
		bt7=new Button("Remove Employee");
		bt7.setFont(f1);
		bt7.setBounds(100,350,250,40);
		panel.add(bt7);
		bt7.addActionListener(this);

		bt8=new Button("Update Employee Info");
		bt8.setFont(f1);
		bt8.setBounds(100,400,250,40);
		panel.add(bt8);
		bt8.addActionListener(this);
				
		add(panel);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent m) {
		String a=m.getActionCommand();
		if(a.equals("Add/Remove Employee")) {
			new AddEmployee();
			setVisible(false);
			
		}
		else if(a.equals("Logout")) {
			setVisible(false);
			new Login();
		}
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	public void windowClosing(WindowEvent e) {System.exit(0);}
	public void windowClosed(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	
	
	

}
