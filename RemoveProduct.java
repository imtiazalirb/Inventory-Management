import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class RemoveProduct extends Frame
{
	private Button bt1,bt2;
	private Label id,batch,amnt;
	private TextField tf1, tf2,tf3;
	private Panel panel;

	RemoveProduct()
	{
		super("Remove Product");
		setSize(550,600);
		setLocation(600,0);
		panel = new Panel();
		panel.setLayout(null);
		


		Font f1 = new Font ("Helvetica", Font.BOLD, 15);
		Font f2 = new Font ("Helvetica", Font.BOLD, 13);

		id = new Label("Product ID");
		id.setBounds(50,150,150,40);
		id.setFont(f1);
		panel.add(id);

		batch = new Label ("Product Batch");
		batch.setBounds(50,200,150,40);
		batch.setFont(f1);
		panel.add(batch);

		amnt = new Label ("Product Amount");
		amnt.setBounds(50,250,150,40);
		amnt.setFont(f1);
		panel.add(amnt);

		tf1 = new TextField();
		tf1.setBounds(250,150,250,40);
		panel.add(tf1);

		tf2 = new TextField();
		tf2.setBounds(250,200,250,40);
		panel.add(tf2);

		tf3 = new TextField();
		tf3.setBounds(250,250,250,40);
		panel.add(tf3);

		bt1 = new Button("Remove");
		bt1.setBounds(200,470,60,40);
		bt1.setFont(f2);
		panel.add(bt1);

		bt2 = new Button("Cancel");
		bt2.setBounds(270,470,60,40);
		bt2.setFont(f2);
		panel.add(bt2);

		add(panel);
		setVisible(true);


	}
}