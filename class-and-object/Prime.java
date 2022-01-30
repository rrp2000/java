import java.util.*;

class Prime_demo {

    int n;
    Scanner sc = new Scanner(System.in);
    void in()
    {
        System.out.println("enter a number to check if its prime :");
        n=sc.nextInt();
    }

    void calc()
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                System.out.println(+n+"is not a prime number.");
            }
            
        }
        System.out.println(+n+"is a prime number.");
    }
    
}
class Prime{

    public static void main(String[] args) {
        Prime_demo ob = new Prime_demo();
        ob.in();
        ob.calc();
    }
}