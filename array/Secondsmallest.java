import java.util.*;
public class Secondsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers:");
        int max=0,max2=0;
        for(int i=0;i<10;i++)
        {
            arr[i]= sc.nextInt();
        }
        sc.close();
        System.out.println("Elements in the array are: ");
        for(int i=0;i<10;i++)
        {
            System.out.print(+arr[i]+" ");
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]>max2)
            {
                if(arr[i]>max)
                {
                    max2=max;
                    max=arr[i];
                }
                else if(arr[i]==max){
                max=arr[i];
                } 
                else
                max2=arr[i];
            }
        }
        System.out.println("2nd largest element is "+max2);
        System.out.println(max);

    }

}
