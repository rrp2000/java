public class ArrayPaliindrom {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,7,4,8,2,1};
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+",");
        }
        System.out.println(" ");
        int i;
        for(i=0;i<arr1.length/2;i++)
        {
            if(arr1[i]==arr1[arr1.length-i-1])
            continue;
            else break;
           
        }
        if(i==arr1.length/2){
            System.out.println("Palindrom ");
        }
        else
        {
            System.out.println(" not palindrom");
        }

    }
}
