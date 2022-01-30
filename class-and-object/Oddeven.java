
import java.util.*;
class Oddeven {
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n,even=0,odd=0;
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++)
        {
            n=sc.nextInt();
            if(n%2==0)
            {
                even++;
            }
            else
            odd++;

        }
        sc.close();
        System.out.println("there are "+even+" numbers of even numbers and "+odd+" numbers of odd numbers.");
    }    
}
