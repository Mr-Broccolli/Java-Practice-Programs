package Conversion;

import java.util.*;
class BinToDec {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any binary number: ");
        String bin = sc.next();
        double dec = 0.0;
        int pos = bin.indexOf(".");
        if(pos == -1)
            pos = bin.length();
        int p = 0;
        for(int i = pos - 1; i >= 0; i--) {
            char bit = bin.charAt(i);
            if(bit == '1')
                dec = dec + Math.pow(2, p);
            p++;
        }
        p = -1;
        for(int i = pos + 1; i < bin.length(); i++) {
            char bit = bin.charAt(i);
            if(bit == '1')
                dec = dec + Math.pow(2, p);
            p--;
        }
        System.out.println("Decimal Number = " + dec);
    }
}
