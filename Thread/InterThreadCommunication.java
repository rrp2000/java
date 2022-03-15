class bankAccount
{
    int money = 5000;
    synchronized void withdrawMoney(int withdraw)
    {
        
        System.out.println("Before withdraw available money is: "+money);
        System.out.println("I want to withdraw");
        if(money<withdraw)
        {
            System.out.println("Insufficient balance");
        }
        try
        {
            wait();
        }
        catch(Exception ob)
        {
            System.out.println(ob);
        }
        System.out.println("Withdraw successful");
    }
    synchronized void depositMoney( int deposit)
    {
        System.out.println("Before deposit available money is: "+money);
        System.out.println("depositing money......");
        try
        {
            Thread.sleep(2000);
        }
        catch(Exception ob)
        {
            System.out.println(ob);
        }
        System.out.println("deposit successful.");
        money = money+deposit;
        System.out.println("After deposit available money is: "+money);
        notify();
    }
}

class me extends Thread
{
    bankAccount sbi;
    me(bankAccount sbi)
    {
        this.sbi = sbi;
    }
    public void run()
    {
        sbi.withdrawMoney(25000);
    }
}
class papa extends Thread
{
    bankAccount sbi;
    papa(bankAccount sbi)
    {
        this.sbi = sbi;
    }
    public void run()
    {
        sbi.depositMoney(30000);
    }
}


public class InterThreadCommunication {
    public static void main(String[] args) {
        bankAccount sbi = new bankAccount();
        me rosan = new me(sbi);
        papa sudip =  new papa(sbi); 
        rosan.start();
        sudip.start();   
    }
}
