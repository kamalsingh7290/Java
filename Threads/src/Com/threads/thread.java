package Com.threads;

public class thread {
    static{
        Thread t=Thread.currentThread();
        System.out.println("name of thread in static is "+t.getName());
    }
    public static void main(String... args) 
    {
        Thread t=Thread.currentThread();
        System.out.println("name of thread in main class "+t.getName());    
        System.out.println("priorty of thread in main "+t.getPriority());
        t.setPriority(7);
        t.setName("MyThread");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            
        }
        System.out.println("name of thread in main class "+t.getName());    
        System.out.println("priorty of thread in main "+t.getPriority()); 

    }
}
