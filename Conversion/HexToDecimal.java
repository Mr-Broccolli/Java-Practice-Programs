package Conversion;

import java.util.Scanner;
class HexToDecimal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine().toUpperCase();
        int decimal = 0, base = 1;//16^0
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            if (ch >= '0' && ch <= '9') {
                decimal = decimal + (ch - '0') * base;
            } else if (ch >= 'A' && ch <= 'F') {
                decimal = decimal + (ch - 'A' + 10) * base;
            }
            base = base * 16;
        } System.out.println("Decimal equivalent: " + decimal);
    }
}
