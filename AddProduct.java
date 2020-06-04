import java.awt.Button;
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


public class AddProduct extends Frame implements WindowListener, ActionListener{
	private Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;
	private Label id,name,batch,amnt,dom,doe,bp,sp;
	private TextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	//private Button bt1, bt2;
	private Panel panel;

	AddProduct()
	{
		super("Add Product");
		addWindowListener(this);
		setSize(550,600);
		setLocation(600,0);
		panel = new Panel();
		panel.setLayout(null);
		setVisible(true);

		Font f1 = new Font ("Helvetica", Font.BOLD, 15);
		Font f2 = new Font ("Helvetica", Font.BOLD, 13);

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

		amnt = new Label ("Product Amount");
		amnt.setBounds(50,200,150,40);
		amnt.setFont(f1);
		panel.add(amnt);

		dom = new Label ("Date of Manufacture");
		dom.setBounds(50,250,150,40);
		dom.setFont(f1);
		panel.add(dom);

		doe = new Label ("Date of Expire");
		doe.setBounds(50,300,150,40);
		doe.setFont(f1);
		panel.add(doe);

		bp = new Label ("Buying Price");
		bp.setBounds(50,350,150,40);
		bp.setFont(f1);
		panel.add(bp);

		sp = new Label ("Sell Price");
		sp.setBounds(50,400,150,40);
		sp.setFont(f1);
		panel.add(sp) ;




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

		tf7 = new TextField();
		tf7.setBounds(250,350,250,40);
		panel.add(tf7);

		tf8 = new TextField();
		tf8.setBounds(250,400,250,40);
		panel.add(tf8);




		bt1 = new Button("Add");
		bt1.setBounds(200,470,60,40);
		bt1.setFont(f2);
		panel.add(bt1);
		bt1.addActionListener(this);

		bt2 = new Button("Cancel");
		bt2.setBounds(270,470,60,40);
		bt2.setFont(f2);
		panel.add(bt2);



		add(panel);
		//INSERT INTO `product` (`pid`, `pname`, `pbatch`, `pqnt`, `dm`, `dex`, `bprice`, `sprice`) VALUES ('01', 'name', 'batch', '1', '0-0-0', '0-0-0', '1', '2');
		

	}
	public void actionPerformed(ActionEvent e) {
		String s=e.getActionCommand();
		if(s.equals("Add")){
			String id=tf1.getText();
			String name=tf2.getText();
			String batch=tf3.getText();
			String quantity=tf4.getText();
			String dom=tf5.getText();
			String dex=tf6.getText();
			String bp=tf7.getText();
			String sp=tf8.getText();
			String q="INSERT INTO product VALUES(null,'"+id+"','"+name+"',"+batch+","+quantity+","+dom+","+dex+","+bp+","+sp+");";
			System.out.println(q);
			DataAccess da=new DataAccess();
			int c=da.updateDB(q);
			JOptionPane.showMessageDialog(this,c+" row(s) updated");
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