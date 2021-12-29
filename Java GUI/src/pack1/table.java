package pack1;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.ScrollPaneUI;

//import javax.swing.JTextField;
import java.awt.*;
public class table implements ListSelectionListener{

	static JTable jt;
	static JTextField t;
	public static void main(String []args) 
	{
		JFrame j =new JFrame("Table");
		 t =new JTextField(10);
		j.setVisible(true);
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String col[]= {"name","age","id"};
		String data[][]= {
				{"ram","20","101"},{"shyam","21","102"},{"Vijay","13","103"},{"Vishal","22","104"},{"kamal","21","105"},
				{"gollu","24","106"},{"aman","22","107"},
		};
		jt=new JTable(data,col);
		ListSelectionModel m=jt.getSelectionModel();
		m.addListSelectionListener(new table());
		j.add(t);
		j.add(new JScrollPane(jt));
		jt.setCellSelectionEnabled(true);
		j.setSize(500,300);
	}
	public void valueChanged(ListSelectionEvent e) 
	{
		int i=jt.getSelectedRow();
		int c=jt.getSelectedColumn();
		Object o=jt.getValueAt(i, c);
		t.setText(o.toString());
	}
}
