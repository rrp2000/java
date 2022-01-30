
public class DivisibleBySumOfDigits {
    public static void main(String[] args) {
        int n=1,digit=0;int sum=0;
        System.out.println("The number divisible by the sum of the digits between 1 to 10000 are : ");
        for(n=1;n<=10000;n++)
        {
            sum=0;
            digit=0;
            int temp = n;
            while(temp!=0)
            {
                digit=temp%10;
                sum=sum+digit;
                temp=temp/10;

               // System.out.println(sum+" ");
            }
            if((n%sum)==0)
            {
                System.out.println(n+" ");
            }
        }
    }
}
