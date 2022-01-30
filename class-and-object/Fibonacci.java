import java.util.*;
class Fibonacci_demo {
    int n;int a=1;int b=1;int sum=0;
    void input(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("how long your fibonacci series would be:");
        n=sc.nextInt();
    sc.close();

    }
    
    void calc()
    {
        for(int i=1;i<=n;i++)
        {
            sum=a+b;
            System.out.println(5+sum+" ");
            a=b;
            b=sum;
        }
    }
}
class Fibonacci{

    public static void main(String[] args) {
        
        Fibonacci_demo ob = new Fibonacci_demo();
        ob.input();
        ob.calc();
    }
}
