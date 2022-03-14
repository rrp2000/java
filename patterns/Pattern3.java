import java.util.Scanner;

/*
    Pattern:
        *****
         ****
          ***
           **
            *
*/
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much level you want your pattern to be:");
        int level = sc.nextInt();
        for(int i=0;i<level;i++)
        {
            int j;
            for(j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=j;k<=level;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
