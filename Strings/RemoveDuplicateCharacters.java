package Strings;

import java.util.Scanner;
class RemoveDuplicateCharacters
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (result.indexOf(ch) == -1)
                result += ch;
        }
        System.out.println("String after removing duplicate characters: " + result);
    }
}
