package Strings;

import java.util.Scanner;
class ExtractSubstring
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter starting index: ");
        int start = sc.nextInt();
        System.out.print("Enter ending index: ");
        int end = sc.nextInt();

        if (start < 0 || end > s.length() || start >= end)
        {
            System.out.println("Invalid index values");
            return;
        }

        String sub = s.substring(start, end);
        System.out.println("Extracted substring: " + sub);
    }
}
