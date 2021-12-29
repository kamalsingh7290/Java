package Com.threads;

public class runnable1 implements Runnable {

	public static void main(String[] args) {
		
		runnable1 obj=new runnable1();
		Thread t1=new Thread(obj);
		t1.start();
	}

	@Override
	public void run() {
		System.out.println("hlo thread start");
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}

}
