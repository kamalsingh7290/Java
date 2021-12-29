package graphics;
import java.awt.*;
import java.awt.Graphics;
public class draw extends Frame 
{
	public void paint(Graphics gra)
	{
		gra.setColor(Color.RED);
		gra.drawLine(100,100,100,100);
		gra.drawRect(100,100,100,100);
		
	}
	
	public static void main(String[] args) {
		draw d=new draw();
		d.setBackground(Color.YELLOW);
		d.setSize(500,500);
		d.setVisible(true);
		//		Graphics gt=d.getGraphics();
//		gt.drawLine(100,100,100,100);
//		gt.setColor(Color.RED);
	}

}
