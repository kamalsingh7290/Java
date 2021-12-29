package Com.threads;

import java.awt.Frame;
import java.util.Timer;
import java.util.TimerTask;

class Mytask extends TimerTask
{
	public void run()
	{
		Frame f=new Frame("huiApp");
		f.setSize(300,300);
		f.setVisible(true);
	}
}

public class TimerTaskClass {

	public static void main(String[] args) {
		
		Timer times=new Timer();
		times.scheduleAtFixedRate(new Mytask(), 10000, 2000);
		
//		times.scheduleAtFixedRate(new TimerTask() {
//			
//			@Override
//			public void run() {
//				System.out.println("hlooo");
//			}
//		},3000,3000);
	}

}
