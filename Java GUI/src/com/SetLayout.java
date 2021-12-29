package com;

import java.awt.*;

public class SetLayout {
	 Frame f;
	 Button b1,b2;
	 TextField t1,t2,t3;
	 Label l1,l2,l3;
	 SetLayout(String title)
	 {
		f=new Frame(title);
		f.setVisible(true);
		f.setSize(900,300);
		f.setBackground(Color.red);
		f.setLocation(100,0);
		b1=new Button("Add");
		b2=new Button("two");
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		l1=new Label("Enter first Name");
		l2=new Label("Enter last Name");
		l3=new Label("Result");
//		f.setLayout(new FlowLayout());
//		f.setLayout(null);
//		f.setLayout(new FlowLayout());
//		f.setLayout(new FlowLayout(FlowLayout.LEFT));
//		f.setLayout(new FlowLayout(FlowLayout.LEFT,40,40));
//		f.setLayout(new GridLayout(3,3));
//		f.setResizable(false);
//		f.add(l1);
//		f.add(t1);
//		f.add(l2);
//		f.add(t2);
//		f.add(l3);
//		f.add(t3);
//		f.add(b1);
//		f.add(b2);
		f.setLayout(new BorderLayout());
		f.add(l1,BorderLayout.EAST);
		f.add(t1,BorderLayout.WEST);
		f.add(l2,BorderLayout.NORTH);
		f.add(t2,BorderLayout.SOUTH);
		
//		l1.setBounds(100,50,120,30);
//		l1.setBackground(Color.yellow);
//		t1.setBounds(240,50,200,30);
//		t1.setBackground(Color.pink);
//		l2.setBounds(100,100,120,30);
//		l2.setBackground(Color.yellow);
//		t2.setBounds(240,100,200,30);
//		t2.setBackground(Color.pink);
//		l3.setBounds(100,150,120,30);
//		l3.setBackground(Color.yellow);
//		t3.setBounds(240,150,200,30);
//		t3.setBackground(Color.pink);
//		b1.setBounds(110,200,100,30);
//		b1.setBackground(Color.pink);
//		b2.setBounds(250,200,150,30);
//		b2.setBackground(Color.pink);
	 }
	public static void main(String[] args) {
		SetLayout obj=new SetLayout("Layout");
	}

}
