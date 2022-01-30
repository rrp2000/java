import java.util.*;
public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers:");
        int max=0;
        for(int i=0;i<10;i++)
        {
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("Elements in the array are: ");
        for(int i=0;i<10;i++)
        {
            System.out.println(+arr[i]+" ");
        }

        for(int i=0;i<10;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        System.out.println("Largest element in the array is: "+max );
    }    
}
