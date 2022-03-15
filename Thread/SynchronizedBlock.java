class Synchronization
{
    void show()
    {
        int index;
        synchronized(this)
        {
            for(index = 1; index<=10; index++)
            {
                System.out.println("Current Thread "+Thread.currentThread().getId()+" with value: "+index);
            }
            try{
                Thread.sleep(300);
            }
            catch(Exception ob)
            {
                System.out.println(ob);
            }
        }
    }
}
class thread3 extends Thread
{
    Synchronization ob;
    thread3(Synchronization ob)
    {
        this.ob = ob;
    }
    public void run()
    {
        ob.show();
    }
}
class thread4 extends Thread
{
    Synchronization ob;
    thread4(Synchronization ob)
    {
        this.ob = ob;
    }
    public void run()
    {
        ob.show();
    }

}
class SynchronizedBlock {
    public static void main(String[] args) {
        Synchronization ob = new Synchronization();
        thread3 t1 = new thread3(ob);
        thread4 t2 = new thread4(ob);
        t1.setPriority(1);
        t2.setPriority(2);
        t1.start();
        t2.start();

    }
}
