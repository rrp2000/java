import java.util.Scanner;

/*
    Pattern:
            *
           **
          ***
         ****
        *****

*/


public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much level you want your pattern to be:");
        int level = sc.nextInt();
        for(int i=0;i<level;i++)
        {
            int j=0;
           for(j=5;j>i;j--)
           {
                System.out.print(" ");
           }
           for(int k=j;k>=0;k--)
           {
               System.out.print("*");
           }
           System.out.println("");
        }
    }
}
