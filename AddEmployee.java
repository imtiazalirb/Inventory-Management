import java.awt.*;
import java.awt.event.*;


public class AddEmployee extends Frame
{
	private Label id,name,gender,dob,job,sal;
	private TextField tf1,tf2,tf3,tf4,tf5,tf6;
	private Button bt1, bt2;
	private Panel panel;

	AddEmployee()
	{
		super("Add Employee");
		//addWindowListener(this);
		setSize(550,600);
		setLocation(600,0);
		panel = new Panel();
		panel.setLayout(null);
		setVisible(true);

		Font f1 = new Font ("Helvetica", Font.BOLD, 15);
		Font f2 = new Font ("Helvetica", Font.BOLD, 13);

		id = new Label ("Employee ID");
		id.setBounds(50,50,100,40);
		id.setFont(f1);
		panel.add(id);

		name = new Label ("Employee Name");
		name.setBounds(50,100,150,40);
		name.setFont(f1);
		panel.add(name);

		gender = new Label ("Gender");
		gender.setBounds(50,150,150,40);
		gender.setFont(f1);
		panel.add(gender);

		dob = new Label ("Date of Birth");
		dob.setBounds(50,200,150,40);
		dob.setFont(f1);
		panel.add(dob);

		job = new Label ("Designation");
		job.setBounds(50,250,150,40);
		job.setFont(f1);
		panel.add(job);

		sal = new Label ("Salary");
		sal.setBounds(50,300,150,40);
		sal.setFont(f1);
		panel.add(sal);

		



		tf1 = new TextField();
		tf1.setBounds(250,50,250,40);
		panel.add(tf1);

		tf2 = new TextField();
		tf2.setBounds(250,100,250,40);
		panel.add(tf2);

		tf3 = new TextField();
		tf3.setBounds(250,150,250,40);
		panel.add(tf3);

		tf4 = new TextField();
		tf4.setBounds(250,200,250,40);
		panel.add(tf4);

		tf5 = new TextField();
		tf5.setBounds(250,250,250,40);
		panel.add(tf5);

		tf6 = new TextField();
		tf6.setBounds(250,300,250,40);
		panel.add(tf6);



		bt1 = new Button("Add");
		bt1.setBounds(200,470,60,40);
		bt1.setFont(f2);
		panel.add(bt1);

		bt2 = new Button("Cancel");
		bt2.setBounds(270,470,60,40);
		bt2.setFont(f2);
		panel.add(bt2);



		add(panel);
	}
}		
