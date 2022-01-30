import java.util.*;
public class InsertAtTheGivenIndexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]=new int[arr1.length+1];
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+",");
        }
        System.out.println(" ");

        System.out.println("Enter the element you want to insert: ");
        int n=sc.nextInt();

        System.out.println("Enter where you want to store it");
        int x = sc.nextInt();
        sc.close();
        int i;
        for(i=0;i<=arr1.length;i++)
        {
            if(i<x-1){
                arr2[i]=arr1[i];
            }
            else if(i==x-1){
                arr2[i]=n;  
            }
            else
            arr2[i]=arr1[i-1];


        }
        for(i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]+",");
        }
        System.out.println(" ");

       

    }
}
