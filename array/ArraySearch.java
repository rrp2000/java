import java.util.*;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int arr2[] = new int[5];
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++)
        {
            arr[i]= sc.nextInt();
        }
       
        System.out.println("Elements in the array are: ");
        for(int i=0;i<10;i++)
        {
            System.out.println(+arr[i]+" ");
        }
        System.out.println("ehich element you want to search: ");
        int n = sc.nextInt();
        sc.close();

        int count=0;
        int i,j = 0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                count++;
                
                arr2[j]=i+1;
                j++;
            }
        }
        if(count>0)
        {
             System.out.println("The element "+n+ " is present "+count+ " times in position ");
             for(i=0;i<arr2.length;i++)
             {
                 if(arr2[i]!=0)
                 {
                    System.out.print(" "+arr2[i]+", ");
                     continue;
                     
                 }
                 else
                 break;
             }

        }
        else
        {
            System.out.println("The element is not present.");

        }

    }
}
