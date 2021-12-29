package Swing;
import java.awt.*;

import javax.swing.JOptionPane;
public class dialog {

	public static void main(String[] args) {
		String str=JOptionPane.showInputDialog(null,"enter you name");
		if (str!=null) 
		{
			JOptionPane.showMessageDialog(null, "YOur name is "+str);
			int i=JOptionPane.showConfirmDialog(null,"Swing is better than AWt ?");
			if (i==JOptionPane.YES_OPTION) 
			{
				JOptionPane.showMessageDialog(null,"YOu are right");
			}
			else if (i==JOptionPane.NO_OPTION) 
			{
				JOptionPane.showMessageDialog(null,"You are wrong ,Take retirement");
			}
			else {
				JOptionPane.showMessageDialog(null, "u are good for nothing leave the planet");
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "You presed cancel button");
		}
	}

}
