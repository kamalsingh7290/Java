package Swing;
import java.awt.*;
import javax.swing.*;

public class lookandfeel {

	public static void main(String[] args) {
		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plat.motif.MotifLookAndFeel");
//			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel("com.sun.java.swing.plat.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JFrame j=new JFrame("Myapp");
		j.setBackground(Color.YELLOW);
		j.setSize(400,400);
		j.setLocation(900,0);
		j.setVisible(true);
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button=new JButton("ok");
		JTextArea textArea=new JTextArea(30,30);
		j.add(button);
		j.add(textArea);
	}

}
