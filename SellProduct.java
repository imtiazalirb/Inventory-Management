import java.awt.*;
import java.awt.event.*;
public class SellProduct extends Frame
{
	private Button bt1,bt2;
	private Label id,name,batch,quantity,price;
	private TextField tf1,tf2,tf3,tf4,tf5;
	private Panel panel;

	SellProduct()
	{
		super("Sell Product");
		setSize(550,600);
		setLocation(600,0);
		panel = new Panel();
		panel.setLayout(null);
		setVisible(true);

		Font f1 = new Font ("Helvetica", Font.BOLD, 15);
		Font f2 = new Font ("Helvetica", Font.BOLD, 13);

		/*All info can be contained in barcode of the product*/

		id = new Label ("Product ID");
		id.setBounds(50,50,100,40);
		id.setFont(f1);
		panel.add(id);

		name = new Label ("Product Name");
		name.setBounds(50,100,150,40);
		name.setFont(f1);
		panel.add(name);

		batch = new Label ("Product Batch");
		batch.setBounds(50,150,150,40);
		batch.setFont(f1);
		panel.add(batch);

		quantity = new Label ("Product Amount");
		quantity.setBounds(50,200,150,40);
		quantity.setFont(f1);
		panel.add(quantity);

		price = new Label ("Price");
		price.setBounds(50,250,150,40);
		price.setFont(f1);
		panel.add(price);



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