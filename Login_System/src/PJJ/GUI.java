package PJJ;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI extends JFrame implements ActionListener {
	JLabel Username;
	JLabel Password;
	JLabel Title;
	JTextField t1;
	JPasswordField p1;
	JButton submit ;
	JLabel message;
	JLabel label;
	JLabel dm;
	JLabel link;
	
	Container c;
	public GUI()
	{
		this.setBounds(500,200,400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("LOGIN");
		this.setLayout(null);
		
		this.getContentPane().setBackground(Color.WHITE);
		label = new JLabel();
		message = new JLabel();
		Username = new JLabel();
		Password = new JLabel();
		link = new JLabel();
		submit = new JButton("SUBMIT");
		dm = new JLabel("Login Using:");
		c = new Container();
		c = this.getContentPane();
		Username.setText("Username:");
		Password.setText("Password:");
		Username.setBounds(50,130,70,20);
		Password.setBounds(50,170,70,20);
		submit.setBounds(130,220,100,25);
		dm.setBounds(140 , 260, 100, 25);
		
		t1 = new JTextField();
		t1.setBounds(170,130,150,28);
		p1 = new JPasswordField();
		p1.setBounds(170,170,150,28);
		submit.setForeground(Color.WHITE);
		submit.setBackground(Color.BLACK);
		try {
		label.setIcon(new ImageIcon(getClass().getResource("log.png")));
		}
		catch (Exception e)
		{
			System.out.println("Image not found");
		}
		try {
			message.setIcon(new ImageIcon(getClass().getResource("logo.png")));
			}
			catch (Exception e)
			{
				System.out.println("Image not found");
			}
		try {
			link.setIcon(new ImageIcon(getClass().getResource("logg.png")));
			}
			catch (Exception e)
			{
				System.out.println("Image not found");
			}
		Dimension size = label.getPreferredSize();
		label.setBounds(50,20,300,100);
		Dimension size1 = message.getPreferredSize();
		message.setBounds(140,260,300,100);
		Dimension size2 = message.getPreferredSize();
		link.setBounds(190,257,300,100);
		submit.addActionListener((ActionListener) this);
		c.add(t1);
		c.add(p1);
		c.add(Username);
		c.add(Password);
		c.add(submit);
		c.add(label);
		c.add(message);
		c.add(dm);
		c.add(link);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String user = t1.getText();
		char[] pass = p1.getPassword();
		String passw = "";
		for(char i : pass)
		{
			passw = passw+i;
		}
		String sql = "select * from logininfo where username ='"+user+"' and password='"+passw+"' ";
		new jdbc(sql);
	}
	
}
