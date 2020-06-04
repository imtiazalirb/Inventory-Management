import java.awt.*;
import java.awt.event.*;
public class ShowProduct extends Frame
{
	private TextArea t1;
	private Button bt1,bt2;

	ShowProduct()
	{
		super("All Product Info");
		setSize(530,600);
		setLocation(600,0);
		setLayout(new FlowLayout());
		setVisible(true);

		Font f1 = new Font ("Helvetica", Font.BOLD, 15);
		Font f2 = new Font ("Helvetica", Font.BOLD, 13);

		t1= new TextArea(30,69);
		add(t1);

		bt1 = new Button("Show");
		bt1.setBounds(150,500,10,10);
		//bt1.setFont(f2);
		add(bt1);

		bt2 = new Button("Cancel");
		bt2.setBounds(270,520,10,10);
		//bt2.setFont(f2);
		add(bt2); 

		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we1)
			{
				System.exit(0);
			}
		});

	}
}