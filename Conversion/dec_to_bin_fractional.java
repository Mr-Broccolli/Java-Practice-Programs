package Conversion;

import java.util.*;
public class dec_to_bin_fractional
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Enter your number in fractional form");
        num = sc.nextDouble();
        String temp = String.valueOf(num);
        int pos = temp.indexOf(".");
        System.out.println(pos);
        
    }
}
