class Synchronization
{
    synchronized void show()
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
    Synchronization ob;
    thread1(Synchronization ob)
    {
        this.ob = ob;
    }
    public void run()
    {
        ob.show();
    }
}
class thread2 extends Thread
{
    Synchronization ob;
    thread2(Synchronization ob)
    {
        this.ob = ob;
    }
    public void run()
    {
        ob.show();
    }

}

class SynchronizedMethod
{
    public static void main(String[] args) {
        Synchronization ob = new Synchronization();
        thread1 t1 = new thread1(ob);
        thread2 t2 = new thread2(ob);
        t1.start();
        t2.start();
    }
}


