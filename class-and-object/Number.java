import java.util.*;
class Number_demo {
Scanner sc = new Scanner(System.in);
    int n,digit=0,rev=0;
    void in()
    {
        System.out.println("Enter a number:");
        n=sc.nextInt();
    }

    void calc()
    {
        System.out.println(+n+" is : ");
        int temp=n;
        while(temp!=0)
        {
            digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
            //System.out.println(digit);
        }    
        temp=rev;
        while(temp!=0)
        {
            
            digit=temp%10;
            temp=temp/10;
           // System.out.println(digit);
            switch(digit)
            {
                case 1:
                System.out.print("one ");
                break;

                case 2:
                System.out.print("two ");
                break;

                case 3:
                System.out.print("three ");
                break;

                case 4:
                System.out.print("four ");
                break;

                case 5:
                System.out.print("five ");
                break;

                case 6:
                System.out.print("six ");
                break;

                case 7:
                System.out.print("seven ");
                break;

                case 8:
                System.out.print("eight ");
                break;

                case 9:
                System.out.print("nine ");
                break;

                case 0:
                System.out.print("zero ");
                break;
            }
        }
    }
}
class Number
{
    public static void main(String[] args) {
        
        Number_demo ob = new Number_demo();
        ob.in();
        ob.calc();
    }
}

    

