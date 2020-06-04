import java.awt.*;
import java.awt.event.*;
public class UpdateEmployee extends Frame
{
	private Button bt1,bt2;
	private TextField tf1,tf2,tf3,tf4;
	private Label msg1,msg2,id,name,salary,phone;
	private Panel panel;
	UpdateEmployee()
	{
		super("Update Employee");
		setSize(550,600);
		setLocation(600,0);
		panel = new Panel();
		panel.setLayout(null);
		setVisible(true);

		Font f1 = new Font ("SANS", Font.BOLD, 15);
		Font f2 = new Font("SANS", Font.BOLD, 13);

		msg1= new Label("Enter the ID of Employee");
		msg1.setBounds(190,60,160,20);
		msg1.setFont(f2);
		panel.add(msg1);

		msg2 = new Label("Enter the Credentials to Change");
		msg2.setBounds(180,160,220,20);
		msg2.setFont(f2);
		panel.add(msg2);

		id = new Label ("Employee ID");
		id.setBounds(50,100,150,40);
		id.setFont(f1);
		panel.add(id);

		name = new Label ("Employee Name");
		name.setBounds(50,200,150,40);
		name.setFont(f1);
		panel.add(name);

		salary = new Label ("Salary");
		salary.setBounds(50,250,150,40);
		salary.setFont(f1);
		panel.add(salary);

		phone = new Label ("Phone");
		phone.setBounds(50,300,150,40);
		phone.setFont(f1);
		panel.add(phone);

		tf1 = new TextField();
		tf1.setBounds(250,100,250,40);
		panel.add(tf1);

		tf2 = new TextField();
		tf2.setBounds(250,200,250,40);
		panel.add(tf2);

		tf3 = new TextField();
		tf3.setBounds(250,250,250,40);
		panel.add(tf3);

		tf4 = new TextField();
		tf4.setBounds(250,300,250,40);
		panel.add(tf4);

		bt1 = new Button("Update");
		bt1.setBounds(200,466,60,40);
		bt1.setFont(f2);
		add(bt1);
		//bt1.addActionListener(this);

		bt2 = new Button("Cancel");
		bt2.setBounds(270,466,60,40);
		bt2.setFont(f2);
		add(bt2);

		add(panel);
	}
}