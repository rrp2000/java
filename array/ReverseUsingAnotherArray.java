public class ReverseUsingAnotherArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        int arr2[]=new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.print(arr1[i]+",");
        }
        System.out.println(" ");
        int i=0,j=9;
        while(i!=10)
        {
            arr2[i]=arr1[j];
            i++;j--;
        }
        for(int z=0;z<10;z++)
        {
            System.out.print(arr2[z]+",");
        }
    }
}
