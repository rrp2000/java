class demo
{
    synchronized static void show()
    {
        int index ;
        for(index = 1; index<=10; index++)
        {
            System.out.println(index);

            try
            {
                Thread.sleep(500);
            }
            catch(Exception ob)
            {
                System.out.println(ob);
            }
        }
    } 
}
class thread1 extends Thread
{
    public void run()
    {
        demo.show();
    }
}
class thread2 extends Thread
{
    public void run()
    {
        demo.show();
    }
}
public class StaticSynchronization {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        t1.start();
        thread2 t2 = new thread2();
        t2.start();
    }
}
