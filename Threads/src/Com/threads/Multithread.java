package Com.threads;
class thread1 extends Thread
{
	thread1(String name)
	{
		super(name);
	}
	public void run()
	{
		Multithread.logic(8);
	}
}
class thread2 extends Thread
{
	thread2(String name)
	{
		super(name);
	}
	public void run()
	{
		Multithread.fxn(7);
	}
}

class thread3 extends Thread
{
	thread3(String name)
	{
		super(name);
	}
	public void run()
	{
		Multithread.fxn(16);
	}
}

public class Multithread {

	public static void main(String[] args) throws InterruptedException {
		thread1 a=new thread1("one");
		thread2 b=new thread2("two");
		thread3 c=new thread3("three");
		a.start();
		Thread.sleep(2000);
		b.start();
		Thread.sleep(2000);
		c.start();
		
	}
	static void logic(int x)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(x*i);
		}
	}
	static void fxn(int x)
	{
		if(x<10)
		{
			System.out.println("you are less than 10");
		}
		else if(x>10)
		{
			System.out.println("you are greater than 10");
		}
	}
}
