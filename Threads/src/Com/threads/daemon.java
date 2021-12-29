package Com.threads;

public class daemon extends Thread 
{
    daemon(String name)
    {
        super(name);
    }
    public void run()
    {
//        System.out.println(Thread.currentThread().getName());

        for(int i=1;i<=10;i++)
        {
           System.out.println(i);
           System.out.println(Thread.currentThread().isDaemon());
        }
    }
    public static void main(String... args) 
    {
//        System.out.println(Thread.currentThread().getName());
        daemon t=new daemon("one");
        t.setDaemon(true);
        System.out.println("hi");
        t.start();
    }    
}
