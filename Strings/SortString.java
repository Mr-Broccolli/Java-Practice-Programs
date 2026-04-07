package Strings;

import java.util.Scanner;
class SortString
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        char a[] = s.toCharArray();
        for (int i = 0; i < a.length - 1; i++)
            for (int j = 0; j < a.length - i - 1; j++)
                if (a[j] > a[j + 1])
                {
                    char t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
        System.out.println("Sorted string: " + new String(a));
    }
}
