package Com.threads;
class banking
{
	int amount;
	synchronized void withdraw(int amount)
	{
		System.out.println("amount is about to withdraw plz wait");
		if(this.amount<amount)
		{
			System.out.println("amount is not sufficent");
//			System.out.println("amount in class is"+this.amount+"and in variable is"+amount);
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.amount=amount;
		System.out.println("now you can withdraw\n amount is "+amount);
	}
	synchronized void sumit(int amount)
	{
		System.out.println("now amount is going to submit");
		this.amount=amount;
		System.out.println("submitted amount is"+amount);
		notify();
	}
}
public class ITCthread {

	public static void main(String[] args) {
		banking obj=new banking();
		
		new Thread()
		{
			public void run()
			{
				obj.withdraw(5000);
			}
		}.start();
		new Thread()
		{
			public void run()
			{
				obj.sumit(10000);
			}
		}.start();
	}

}
