package Strings;

import java.util.Scanner;
class PalindromeString
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--)
            rev += s.charAt(i);
        
        if (s.equalsIgnoreCase(rev))
            System.out.println("Palindrome string");
        else
            System.out.println("Not a palindrome string");
    }
}
