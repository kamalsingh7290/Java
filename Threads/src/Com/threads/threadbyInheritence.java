package Com.threads;

//import sun.jvm.hotspot.runtime.Threads;

public class threadbyInheritence extends Thread
{
//    threadbyInheritence(String name)
//    {
//        super(name);
//    }
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"hlo");

        for(int i=1;i<=10;i++){
            try{
            Thread.sleep(500);}
            catch(Exception e){}
        System.out.println(i);}
    }
    public static void main(String... args) 
    {
        System.out.println(Thread.currentThread().getName());
        threadbyInheritence t=new threadbyInheritence();
        Thread obj=new Thread();
        // t.setName("one");
        t.start();
        // t.run();
        // threadbyInheritence t2=new threadbyInheritence();
        // // t2.start();
        // t.run();
        //  threadbyInheritence t3=new threadbyInheritence();
        // // t3.start();
        // t.run();
    }    
}
