import java.awt.*;
import java.awt.event.*;

public class RemoveEmployee extends Frame
{
	private Button bt1,bt2;
	private Label id,name;
	private TextField tf1,tf2;
	private Panel panel;

	RemoveEmployee()
	{
		super("Remove Employee");
		setSize(550,600);
		setLocation(600,0);
		setVisible(true);
		panel=new Panel();
		panel.setLayout(null);
		add(panel);

		Font f1 = new Font ("Helvetica", Font.BOLD, 15);
		Font f2 = new Font ("Helvetica", Font.BOLD, 13);

		id = new Label ("Employee ID");
		id.setBounds(50,150,150,40);
		id.setFont(f1);
		panel.add(id);

		name = new Label ("Employee Name");
		name.setBounds(50,200,150,40);
		name.setFont(f1);
		panel.add(name);

		tf1 = new TextField();
		tf1.setBounds(250,150,250,40);
		panel.add(tf1);

		tf2 = new TextField();
		tf2.setBounds(250,200,250,40);
		panel.add(tf2);

		bt1 = new Button("Remove");
		bt1.setBounds(200,470,60,40);
		bt1.setFont(f2);
		panel.add(bt1);
		
		bt2 = new Button("Cancel");
		bt2.setBounds(270,470,60,40);
		bt2.setFont(f2);
		panel.add(bt2);

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we1)
			{
				System.exit(0);
			}
		});
	}
}