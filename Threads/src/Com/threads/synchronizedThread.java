package Com.threads;
class table
{
    synchronized static public void print(int x) throws InterruptedException
	{
		Thread.sleep(1000);
		for(int i=1;i<=10;i++)
		{System.out.println(x+"x"+i+"="+x*i);}
	}
   synchronized public void print1(int x) throws InterruptedException
	{
		Thread.sleep(1000);
		for(int i=1;i<=10;i++)
		{System.out.println("object"+x+"x"+i+"="+x*i);}
	}
}
class Mythread1 extends Thread
{
	table t;;
	public Mythread1(table t) 
	{
		this.t=t;
	}
	public void run()
	{
		try {
			t.print1(2);
			table.print(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Mythread2 extends Thread
{
	table t;;
	public Mythread2(table t)
	{
		this.t=t;
	}
	public void run()
	{
		try {
			t.print1(4);
			table.print(4);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Mythread3 extends Thread
{
	table t;;
	public Mythread3(table t)																							
	{
		this.t=t;
	}
	public void run()
	{
		try {
			t.print1(6);
			table.print(6);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
class Mythread4 extends Thread
{
	table t;;
	public Mythread4(table t)
	{
		this.t=t;
	}
	public void run()
	{
		try {
			t.print1(8);
			table.print(8);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class synchronizedThread {

	public static void main(String[] args) {
		table t=new table();
		table tt=new table();
		Mythread1 t1=new Mythread1(t);
		Mythread2 t2=new Mythread2(t);
		Mythread3 t3=new Mythread3(tt);
		Mythread4 t4=new Mythread4(tt);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
