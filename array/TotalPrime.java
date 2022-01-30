public class TotalPrime {
    public static void main(String[] args) {
        int arr1[]={2,3,5,7};
        for(int z=0;z<arr1.length;z++)
        {
            System.out.print(arr1[z]+",");
        }
        System.out.println(" ");
        int i,count=0;
        for(i=0;i<arr1.length;i++)
        {
            count = 0;
            for(int j=1;j<=arr1[i];j++)
            {
                
                if((arr1[i]%j)==0)
                {
                    count++;
                    //System.out.println(+count);
                }
               // System.out.println(+count);
            }
            System.out.println(+count);
            if(count<=2)
            continue;
            else
            break;
            
        }
        if(i==arr1.length)
        {
            System.out.println("prime");

        }
        else
        System.out.println("not prime");

    }
}
