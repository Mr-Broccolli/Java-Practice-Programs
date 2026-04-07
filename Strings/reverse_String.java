package Strings;

import java.util.*;
public class reverse_String
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();
        String reverse = "";
        for(int i = input.length() -1; i>=0; i--) {
            reverse = reverse + input.charAt(i);
        }
        System.out.print(reverse);
    }
}
