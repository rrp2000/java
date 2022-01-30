import java.util.*;
public class Vowels {

    public static void main(String[] args) {
        
        String st;int count=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a string:");
        st = sc.nextLine();
        sc.close();
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
            {
                ++count;
            }
        }

        System.out.println("numbers of vowels available in this strings:"+count);


    }
    
}
