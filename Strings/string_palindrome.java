package Strings;

import java.util.*;   
class string_palindrome 
{  
   public static void main(String args[])  
   {  
      String original;
      String reverse = "";  
      Scanner in = new Scanner(System.in);
      
      System.out.println("Enter a string or number to check if it is a palindrome");  
      original = in.nextLine();
      int length = original.length();   
      for (int i = length - 1; i >= 0; i-- ){
         reverse = reverse + original.charAt(i);
      }
      
      if (original.equals(reverse))  
         System.out.println("Entered string/number is a palindrome.");  
      else  
         System.out.println("Entered string/number isnot a palindrome.");
   }
}
