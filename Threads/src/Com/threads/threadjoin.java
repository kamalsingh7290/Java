package Com.threads;
class singh implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i+"join");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("first thread dead");
	}
}
class mingh implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Second thread dead");
	}
}
class lingh implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("third thread dead");
	}
}
public class threadjoin{

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(new singh());
		Thread t2=new Thread(new mingh());
		Thread t3=new Thread(new lingh());
		t1.start();
		t2.start();
		t3.start();
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		System.out.println("main thread dead");
		t1.join();
	}

}
