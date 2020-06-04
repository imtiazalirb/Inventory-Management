import java.awt.*;
import java.awt.event.*;


public class ShowEmployee extends Frame
{
	private TextArea t1;
	private Button bt1,bt2;
	private Frame frame;

	ShowEmployee()
	{
		super("Show Employee");
		setSize(530,600);
		setLocation(600,0);
		//panel = new Panel();
		setLayout(new FlowLayout());
		setVisible(true);

		t1 = new TextArea(30,67);
		add(t1);

		bt1 = new Button("Show");
		bt1.setBounds(150,500,10,10);
		//bt1.setFont(f2);
		add(bt1);

		bt2 = new Button("Cancel");
		bt2.setBounds(270,520,10,10);
		//bt2.setFont(f2);
		add(bt2); 

		//add(panel);

    	addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we1)
			{
				System.exit(0);
			}
		});
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s=e.getActionCommand();
		if(s.equals("Show"))
		{
			String q="SELECT * FROM Employee;";
			System.out.println(q);
			DataAccess da=new DataAccess();
		}
	}
}