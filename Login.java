import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Login extends Frame implements ActionListener, WindowListener
{
	private Button bt1, bt2;
	private Label lb1,lb2,wlcm,pass;
	private TextField tf;
	private TextField passField;
	private Panel panel;
	Login()
	{
		super("Sales and Inventory Management System - Login");
		addWindowListener(this);
		setSize(800,540);
 		setLocation(500,50);
		panel = new Panel();
		panel.setLayout(null);
		setVisible(true);
		
 		Font f1 = new Font("SANS", Font.BOLD, 22);
 		Font f2 = new Font("SANS", Font.BOLD, 18);
 		Font f3 = new Font("SANS", Font.BOLD, 13);
 		Font f4 = new Font("SANS", Font.BOLD, 15);

 		wlcm = new Label("Welcome");
 		wlcm.setBounds(330,50,100,50);
 		wlcm.setFont(f1);
 		wlcm.setForeground(Color.black);
 		panel.add(wlcm);

 		pass = new Label("Enter your usename and password");
 		pass.setBounds(221,100,450,50);
 		pass.setFont(f2);
 		pass.setForeground(Color.black);
 		panel.add(pass);

 		lb1 = new Label("User ID");
 		lb1.setBounds(200,200,100,30);
 		lb1.setForeground(Color.black);
 		lb1.setFont(f3);
 		panel.add(lb1);

 		lb2 = new Label("Password");
 		lb2.setBounds(200,270,100,30);
 		lb2.setForeground(Color.black);
 		lb2.setFont(f3);
 		panel.add(lb2);

 		tf = new TextField();
 		tf.setBounds(300,202,250,30);
 		panel.add(tf);
 		

 		passField = new TextField();
 		passField.setEchoChar('*');
		passField.setBounds(300,272,250,30);
		panel.add(passField);
 		

 		bt1 = new Button("Login");
 		bt1.setBounds(260,350,80,30);
 		panel.add(bt1);
 		bt1.setFont(f4);
 		bt1.addActionListener(this);
 		

 		bt2 = new Button("Exit");
 		bt2.setBounds(400,350,80,30);
 		panel.add(bt2);
 		bt2.setFont(f4);
 		bt2.addActionListener(this);
 		
 		add(panel); 
    }
	public void actionPerformed(ActionEvent l){
		String s=l.getActionCommand();
		if(s.equals("Login")){
			DataAccess da=new DataAccess();
			String typedName=tf.getText();
			String typedPass=passField.getText();
			
			String q="SELECT * FROM `login`";
			ResultSet rs=null;
			System.out.println("Button pressed");		
			try
			{
				rs=da.getData(q);
				System.out.println(q);
				while(rs.next())
				{
					String n = rs.getString("name");
					String p= rs.getString("pass");
					int user = rs.getInt("user");
					if(n.equals(typedName) && p.equals(typedPass ))
					{
						if (user==0)
						{
							System.out.println("Correct Cred.");
							new Employee();
							setVisible(false);
							break;
						}
						else if (user==1)
						{
							new Manager();
							setVisible(false);
						}
					}
				}
			}
			catch(Exception ex){
				JOptionPane.showMessageDialog(this,"DB Error");
			}
		}
		else if(s.equals("Exit")){
			System.exit(0);
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