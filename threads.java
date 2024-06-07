class A extends Thread
{
    public void run()
    {
        for(int i=1;i<10;i++)
        System.out.println("Hi");
    }
}
class B extends Thread{
    public void run()
    {
        for(int i=1;i<10;i++)
        System.out.println("Hello");
        
    }
}
public class threads {
    public static void main(String[] args) {
        A obj1=new A();
        B obj2=new B();
        obj1.start();
        obj2.start();
        obj1.getPriority();
        obj2.getName();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
}
