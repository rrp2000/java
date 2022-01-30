import java.util.*;
class PalindromeExample{  
    public static void main(String args[]){  
     int r,sum=0,temp;    
     System.out.println("enter a number:");
     Scanner sc= new Scanner(System.in);
     int n=sc.nextInt();
     
     temp=n;    
     while(temp!=0){    
      r=temp%10;   
      sum=(sum*10)+r;    
      temp=temp/10;    
     }    
     if(n==sum)    
      System.out.println(+n+" is a palindrome number ");    
     else    
      System.out.println(+n+" is not a palindrome");    
      sc.close();
   }  
}  