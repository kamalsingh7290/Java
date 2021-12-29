package EventHandling;
import java.awt.*;
import java.awt.event.*;

import javax.swing.Action;
import javax.swing.JOptionPane;
public class actionlistner extends Frame implements ActionListener
{

	Frame f;
	Button b;
	Button b1;
	TextField tf;
	public actionlistner(String title) 
	{
		super(title);
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		b=new Button("Ok");
//		b.addActionListener(this);
		this.add(b);
		b1=new Button("cancel");
//		b1.addActionListener(this);
		this.add(b);
		this.add(b1);
		tf=new TextField(10);
		this.add(tf);
		
		//outer way
//		outer o=new outer(this);
//		b.addActionListener(o);
//		b1.addActionListener(o);
		b.addActionListener(v->{
			System.out.println("hlo");
		});
		b1.addActionListener(v->{
//			System.out.println("kamal");
			JOptionPane.showMessageDialog(null, "heloS");
		});
	
	}	
	public static void main(String[] args) {
		actionlistner a=new actionlistner("Actionlistner");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}