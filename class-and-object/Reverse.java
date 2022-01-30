import java.util.*;

public class Reverse 
{
    public static void main(String args[])
    {
        int num,digit=0,rev=0;

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();

        while(num!=0)
        {
            digit= num%10;
            rev= rev*10+digit;
            num=num/10;
        }

        System.out.println("the reverse of the entered number is "+rev );
        sc.close();
    }
    
}
