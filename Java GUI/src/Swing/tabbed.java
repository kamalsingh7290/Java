package Swing;

import javax.swing.*;
import java.awt.*;
public class tabbed {

	public static void main(String[] args) {
		JFrame j=new JFrame("tabbed");
		j.setVisible(true);
		j.setSize(300,300);
		j.setLayout(new FlowLayout());
		JTabbedPane jt=new JTabbedPane();
		JPanel tab1=new JPanel();
		JButton jn1=new JButton("red");
		JButton jn2=new JButton("black");
		JButton jn3=new JButton("white");
		tab1.add(jn1);  tab1.add(jn2);    tab1.add(jn3);
		
		JPanel tab2=new JPanel();
		JButton jn11=new JButton("gzb");
		JButton jn22=new JButton("delhi");
		JButton jn33=new JButton("uk");
		tab2.add(jn11);  tab1.add(jn22);    tab2.add(jn33);
		
		JPanel tab3=new JPanel();
		JButton jn111=new JButton("eyes");
		JButton jn222=new JButton("lips");
		JButton jn333=new JButton("nose");
		tab3.add(jn111);  tab3.add(jn222);    tab3.add(jn333);
		jt.addTab("color", tab1);
		jt.addTab("place", tab2);
		jt.addTab("parts", tab3);
		j.add(jt);
	}
}
