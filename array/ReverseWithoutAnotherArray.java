public class ReverseWithoutAnotherArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i<10;i++)
        {
            System.out.print(arr1[i]+",");
        }
        System.out.println(" ");

        for(int i=0;i<arr1.length/2;i++)
        {
            int temp=arr1[i];
           arr1[i]= arr1[arr1.length-i-1];
           arr1[arr1.length-i-1]=temp;
        }
        System.out.println("Reverse of the array: ");
        for(int i=0;i<10;i++)
        {
            System.out.print(arr1[i]+",");
        }
    }
}
