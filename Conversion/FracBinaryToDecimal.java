package Conversion;

import java.util.Scanner;
class FracBinaryToDecimal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fractional binary number: ");
        String bin = sc.nextLine();
        int decimalInt = 0;
        double decimalFrac = 0.0;
        int point = bin.indexOf('.'); //Convert integer part
        for (int i = 0; i < point; i++) {
            char ch = bin.charAt(i);
            decimalInt = decimalInt * 2 + (ch - '0');
        }
        // Convert fractional part
        double base = 0.5;
        for (int i = point + 1; i < bin.length(); i++) {
            char ch = bin.charAt(i);
            if (ch == '1') {
                decimalFrac = decimalFrac + base;
            }
            base = base / 2;
        }
        double decimal = decimalInt + decimalFrac;
        System.out.println("Decimal equivalent: " + decimal);
    }
}
