package com;
import java.awt.Frame;
import java.awt.event.*;

import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Label;
import java.awt.FlowLayout;
public class first implements ActionListener
{
	 Frame f;
	 String s1,s2,s3;
	 Button b1,b2;
	 TextField t1,t2,t3;
	 Label l1,l2,l3;
	 first(String title)
	 {
		f=new Frame(title);
		f.setVisible(true);
		f.setSize(500,300);
		f.setBackground(Color.red);
		f.setLocation(700,0);
		b1=new Button("Add");
		b2=new Button("Sub");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		l1=new Label("Enter first Name");
		l2=new Label("Enter last Name");
		l3=new Label("Result");
//		f.setLayout(new FlowLayout());
		f.setLayout(null);
//		f.setResizable(false);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(l3);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		l1.setBounds(100,50,120,30);
		l1.setBackground(Color.yellow);
		t1.setBounds(240,50,200,30);
		t1.setBackground(Color.pink);
		l2.setBounds(100,100,120,30);
		l2.setBackground(Color.yellow);
		t2.setBounds(240,100,200,30);
		t2.setBackground(Color.pink);
		l3.setBounds(100,150,120,30);
		l3.setBackground(Color.yellow);
		t3.setBounds(240,150,200,30);
		t3.setBackground(Color.pink);
		b1.setBounds(110,200,100,30);
		b1.setBackground(Color.pink);
		b2.setBounds(250,200,150,30);
		b2.setBackground(Color.pink);
		s1=t1.getText();
		s2=t2.getText();
		b1.addActionListener(v->{
			if(s1.equals("")&&s2.equals(""))
			{
				JOptionPane.showMessageDialog(null,"Please enter the data");
			}
			else {
				Double d1=Double.parseDouble(s1);
				Double d2=Double.parseDouble(s2);
				if(v.getActionCommand().equals("Add")) {
					t3.setText("ADD="+(d1+d2));
				}
				else {
					t3.setText("Sub="+(d1-d2));
				}
			}
		});
//		b2.addActionListener(v->{
//			if(s1.equals("")&&s2.equals(""))
//			{
//				JOptionPane.showMessageDialog(null,"Please enter the data");
//			}
//			else {
//				Double d1=Double.parseDouble(s1);
//				Double d2=Double.parseDouble(s2);
//				if(v.getActionCommand().equals("Add")) {
//					t3.setText("ADD="+(d1+d2));
//				}
//				else {
//					t3.setText("Sub="+(d1-d2));
//				}
//			}
//		});
	 }
	 
	public static void main(String[] args) {
		first obj=new first("Myapp");
}
}
