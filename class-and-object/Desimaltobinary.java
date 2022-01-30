import java.util.*;
public class Desimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[20];
        int n,rem=0,div=0;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        sc.close();
        int temp= n;
        int i=0;
        if(n!=0)//to devide and storing reminder in an array
        {
            while(temp>=1)
            {
                rem=temp%2;
                div=temp/2;
                temp=div;
                arr[i]=rem;
                i++;
            }
        }
        /*for(int j=0;j<i;j++)//print
        {
            System.out.print(+arr[j]+" ");
        }*/
        
        int x,y;//reverse
        for(x=0;x<i/2;x++)
        {
            y=arr[x];
            arr[x]=arr[i-x-1];
            arr[i-x-1]=y;
        }

        System.out.print("Binary of the number "+n+" is: ");
        for(int j=0;j<i;j++)//print
        {
            System.out.print(+arr[j]+" ");
        }
      


    }
}
