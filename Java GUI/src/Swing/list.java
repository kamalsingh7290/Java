package Swing;
import java.awt.*;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class list implements ListSelectionListener{
	static JFrame j;
	static JList jList;
	static JTextField field;
	public static void main(String[] args) 
	{
		j=new JFrame("Lsit app");
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setLayout(new FlowLayout());
		jList=new JList();
		String s[]= {"keyboard","mouse","monitor","camera","cpu","ups","headphone","pendrive"};
		jList.setListData(s);
		jList.setVisibleRowCount(5);
		jList.addListSelectionListener(new list());
		j.add(new JScrollPane(jList));
		JLabel label=new JLabel("Selected items");
//		j.add(new JLabel("Selected items"));
		field =new JTextField(15);
		j.add(label);
		j.add(field);
		j.setSize(400,400);
		j.setVisible(true);
		
	}
	public void valueChanged(ListSelectionEvent le) 
	{
		Object o[]=jList.getSelectedValues();
		StringBuffer sBuffer=new StringBuffer();
		for (int i = 0; i < o.length; i++) {
			sBuffer.append((String)o[i]);
			sBuffer.append(",");
		}
		field.setText(sBuffer.toString());
	}

}
