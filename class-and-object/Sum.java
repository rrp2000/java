import java.util.*;


public class Sum {

    public static void main(String args[]){

        int a,sum=0,digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        a=sc.nextInt();
        System.out.println("The entered number is:" +a);
        
        while(a>0){

            digit=a%10;
            sum=sum+digit;
            a= a/10;

        }

        System.out.println("sum of the digits of that number is:"+sum);
sc.close();


    }

}
