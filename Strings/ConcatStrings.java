package Strings;

import java.util.Scanner;
class ConcatStrings
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        String result = s1.concat(s2);

        System.out.println("Concatenated string: " + result);
    }
}
