package Strings;

import java.util.*;
public class string_operations
{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String inp;
        System.out.println("Enter a Sentence");
        inp = sc.nextLine();
        
        int j;
        boolean check = false;
        int a = (int)('a');
        int e = (int)('e');
        int i = (int)('i');
        int o = (int)('o');
        int u = (int)('u');
        for(j=0; j<inp.length(); j++)
        {
            if((inp.charAt(j) == a) || (inp.charAt(j) == e) || (inp.charAt(j) == i) || (inp.charAt(j) == o) || (inp.charAt(j) == u))
            {
                check = true;
            }
            else if((inp.charAt(j) != a) || (inp.charAt(j) != e) || (inp.charAt(j) != i) || (inp.charAt(j) != o) || (inp.charAt(j) != u))
            {
                check = false;
            }
        }
        
        if(check = true)
        {
            System.out.println("Your word has a vowel");
        }
        else
        {
            System.out.println("Your word does not have a vowel");
        }
    }
}
