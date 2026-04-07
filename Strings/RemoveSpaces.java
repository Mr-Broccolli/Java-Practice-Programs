package Strings;

import java.util.Scanner;
class RemoveSpaces
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != ' ')
                result += s.charAt(i);

        System.out.println("String without spaces: " + result);
    }
}
