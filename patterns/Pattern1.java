/*
    pattern:
        ******
        ****
        ***
        **
        *
*/


import java.util.Scanner;

class Pattern1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much level you want your pattern to be:");
        int level = sc.nextInt();
        int temp = level;
        for(int i=0;i<level;i++)
        {
            for(int j = 0;j<temp;j++)
            {
                System.out.print("*");
                
            }
            System.out.println(" ");
            temp--;
        }
    }
}