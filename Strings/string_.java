package Strings;

import java.util.*;
public class string_
{
    String inp;
    public void input() {
        Scanner sc = new Scanner(System.in);
        inp = sc.nextLine();
    }
    public String counting()
    {
        int i;
        boolean check;
        for(i=0; i<inp.length(); i++)
        {
            if(inp.charAt(i).equalsTo("a") || inp.charAt(i).equalsTo("e") || inp.charAt(i).equalsTo("i") || inp.charAt(i).equalsTo("o") || inp.charAt(i).equalsTo("u"))
            {
                check = true;
            }
            else
            {
                check = false;
            }
        }
    }
    public static void main()
    {
        return check;
        if(check = true)
        {
            System.out.println("Your word has a vowel");
        }
        else if(check = false)
        {
            System.out.println("Your word does not has a vowel");
        }
    }
}
