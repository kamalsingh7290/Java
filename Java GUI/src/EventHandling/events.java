package EventHandling;
import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.basic.BasicTabbedPaneUI.MouseHandler;

public class events extends Frame {
	Frame f;
	Button b1;
	TextField t1;
	public events(String title)
	{
		super(title);
		this.setVisible(true);
		this.setSize(400,400);
		this.setLayout(new FlowLayout());
		b1=new Button("Ok");
		this.add(b1);
		t1=new TextField(10);
		this.add(t1);
		this.addWindowListener(new mywindow());
		t1.addKeyListener(new mylistener());
		}

	public static void main(String[] args) {
		events e=new events("Events");
	}

}
class mywindow extends WindowAdapter
{
	public void windowClosing(WindowEvent v)
	{
		System.exit(0);
	}
}
class mylistener extends KeyAdapter
{
	public void keyTyped(KeyEvent arg0) {
		System.err.println("Typed..");
	}
}
class mymouse extends MouseListener
{
	
}
