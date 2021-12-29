package Com.threads;
import java.io.*;
class shutdownhook extends Thread
{
	public void run()
	{
	
	System.out.println("hlooo");
//		try {
//			Thread.sleep(2000);
			
			
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
	
//		for(int i=0;i<10000;i++)
//		System.out.println("hlo shutdown hook "+i);
	}
}

public class shutdown {

	public static void main(String[] args) {
		shutdownhook obj=new shutdownhook();
		Runtime robj=Runtime.getRuntime();
		try {
			robj.exec("notepad.exe");
		} catch (Exception e) {
			// TODO: handle exception
		}
//		Runtime robj=Runtime.getRuntime();
//		robj.addShutdownHook(obj);
		System.exit(0);
		
		obj.start();

	}

}
