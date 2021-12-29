package Swing;
import java.awt.*;
import javax.swing.*;

import com.first;

public class menuBar {

	public static void main(String[] args) {
		JFrame j =new JFrame("Menu bar");
		JMenuBar m= new JMenuBar();
		JMenu menu1=new JMenu("File");
		JMenu menu2=new JMenu("Edit");
		JMenuItem i1=new JMenuItem("item1");
		JMenuItem i2=new JMenuItem("item2");
		JMenuItem i3=new JMenuItem("item3");
		JMenuItem i4=new JMenuItem("item1");
		JMenuItem i5=new JMenuItem("item2");
		JMenuItem i6=new JMenuItem("item3");
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		j.setSize(300,300);
		j.setLocation(700,0);
		menu1.add(i1);	menu1.add(i2);	menu1.add(i3);
		menu2.add(i4);	menu2.add(i5);	menu2.add(i6);
		menu1.add(menu2);
		m.add(menu1);
		j.setJMenuBar(m);
		ImageIcon i=new ImageIcon(".onionnew.jpg");
	   JButton img=new JButton(i);
	   img.setBounds(100,100,100,100);
	   img.setIcon(i);
	   j.add(img);
		
	}

}
