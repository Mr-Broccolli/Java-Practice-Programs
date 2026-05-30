package Strings;

import java.util.*;
public class string_reverse
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr [] = s.split (" ");
        String rev = " ";
        for(String words : arr)
        {
            for(int i = 0;i < words.length()-1;i++)
            {
                rev = rev + words.charAt(i);
            }
        }
        System.out.print(rev);
    }
}
