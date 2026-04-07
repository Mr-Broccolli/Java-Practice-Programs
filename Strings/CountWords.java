package Strings;

import java.util.Scanner;
class CountWords
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim();
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            }
            else if (ch == ' ')
                inWord = false;
        }
        System.out.println("Number of words = " + count);
    }
}
