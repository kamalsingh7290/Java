package EventHandling;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

import javax.swing.Action;
public class outer implements ActionListener {

	actionlistner a;
	outer(actionlistner a)
	{
		this.a=a;
	}
	public void	 actionPerformed(ActionEvent e) 
	{
		Button btn=(Button) e.getSource();
		if(btn==a.b)
			a.tf.setText("Kamal");
		else
		a.tf.setText("");
	}
}
