import java.util.*;
public class prime_bet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int x= sc.nextInt();
        System.out.println("Enter the ending number:");
        int y= sc.nextInt();
        int count=0;
        sc.close();
        System.out.print("prime numbers between "+x+" and "+y+ " are: ");
        for(int i=x;i<=y;i++)
        {
            //System.out.print(i+" ");
            count=0;
            int j;
            for(j=1;j<=i;j++)
            {
                if((i%j)==0)
                {
                    count++;
                }
            }
            if (count==2)
            {
                System.out.print(i+" ");
            }
        }

    }
}
