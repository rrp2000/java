import java.util.*;
public class xtothepowery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x:");
        int x= sc.nextInt();
        System.out.println("Enter y:");
        int y= sc.nextInt();
        int res= x;
        sc.close();
        if(y>=2)
        {
            
        for(int i=1;i<y;i++)
        {
            res=res*x;
        }
        System.out.println(+x+" to the power "+y+" is "+res);
        }
        else
        {
            System.out.println(+x+" to the power "+y+" is "+x);
        }
    }
    
}
