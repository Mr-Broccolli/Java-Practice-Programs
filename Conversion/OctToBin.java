package Conversion;

import java.util.Scanner;
class OctToBin
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter octal number: ");
        String oct = sc.next();
        String bin = "";
        for (int i = 0; i < oct.length(); i++)
        {
            char c = oct.charAt(i);
            if (c == '0')      bin += "000";
            else if (c == '1') bin += "001";
            else if (c == '2') bin += "010";
            else if (c == '3') bin += "011";
            else if (c == '4') bin += "100";
            else if (c == '5') bin += "101";
            else if (c == '6') bin += "110";
            else if (c == '7') bin += "111";
        } System.out.println("Binary value: " + bin);
    }
}
