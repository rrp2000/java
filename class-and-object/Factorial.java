import java.util.*;
class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for factorial:");
        int n=sc.nextInt();
        
        int count=n-1;
        int fact=n;
        while(count>=1){

            fact=fact*count;
            count--;

        }
        System.out.println("Factorial of "+n+ " is "+fact);
        sc.close();
    }
}
