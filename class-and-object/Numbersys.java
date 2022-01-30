import java.util.*;
class Numbersys {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,sq,sqr=0,cube;
        System.out.println("enter a number from where you want to print:");
        int lim1=sc.nextInt();
        System.out.println("enter the number till where you want to print:");
        int lim2=sc.nextInt();
        sc.close();
        System.out.println("===========================================");
        System.out.println("NUMBER     SQUARE     SQUARE_ROOT     CUBE");
        System.out.println("------     ------     -----------     ----");
        for(num=lim1;num<=lim2;num++)
        {
            sq=num*num;
            cube=sq*num;
            for(int i=1;i*i<=num;i++)
            {
                sqr=i;
            }
           System.out.printf("%d %10d %10d %15d\n",num,sq,sqr,cube);
           // System.out.println(+num+"     "+sq+"     "+sqr+"     "+cube);
        }
       System.out.println("===========================================");
        
    }
}
