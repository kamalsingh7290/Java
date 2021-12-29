package Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.*;
public class scroll {

	public static void main(String[] args) {
		JFrame jf=new JFrame("ScollView");
		JPanel j=new JPanel();
		jf.setSize(400,400);
		jf.setVisible(true);
		jf.add(j);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLayout(new GridLayout(10,4));
		JButton b[]=new JButton[3000];
		for (int i = 0; i < b.length; i++) {
			b[i]=new  JButton("Button"+i);
			j.add(b[i]);
		}
		JScrollPane sPane=new JScrollPane(j);
		jf.add(sPane);
	}

}
