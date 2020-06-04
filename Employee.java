import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Employee extends Frame implements WindowListener, ActionListener{
	
	private Button bt1,bt2,bt3,bt4;
	private Panel panel;
	Employee(){
		super("Employee");
		addWindowListener(this);
		setSize(450,450);
		setLocation(100,0);
		panel = new Panel();
		panel.setLayout(null);
		
		Font f1 = new Font ("SANS", Font.BOLD, 15);
		Font f2 = new Font("SANS", Font.BOLD, 13);
		
        bt1=new Button("My Profile");
		bt1.setFont(f2);
		bt1.setBounds(275,30,80,30);
		panel.add(bt1);
		
		bt2=new Button("Logout");
		bt2.setBounds(357,30,60,30);
		panel.add(bt2);
		bt2.setFont(f2);
		bt2.addActionListener(this);
		
		bt3=new Button("Sell Product");
		bt3.setFont(f1);
		bt3.setBounds(100,150,250,40);
		panel.add(bt3);
		
		bt4=new Button("Refund Product");
		bt4.setFont(f1);
		bt4.setBounds(100,200,250,40);
		panel.add(bt4);
		
		add(panel);
		setVisible(true); 
	}
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		if(s.equals("Logout")) {
			setVisible(false);
			new Login();
		}
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){System.exit(0);}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
	
	
	
	
}