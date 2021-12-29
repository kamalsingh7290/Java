package Com.threads;

public class AnonymousThread {

	public static void main(String[] args) {
//		Runnable r=new Runnable()
//		{
//			public void run() 
//			{
//				System.out.println("hlo anonymous thread 1");
//			}
//		};
//		Thread t=new Thread(r);
//		t.start();
		
		
//		new Thread(new Runnable()
//		{
//			public void run()
//			{
//				System.out.println("hlo anonymous thread 2");
//			}
//		}).start();
		
		
//		Thread t=new Thread(new Runnable()
//				{
//			public void run()
//			{
//				System.out.println("hlo anonymous thread 3");
//			}
//				});
//		t.start();
		Thread t=new Thread()
		{
			public void run()
			{
				System.out.println("hlo");
			}
		};
		t.start();
	}

}
