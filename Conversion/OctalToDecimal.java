package Conversion;

import java.util.*;
class OctalToDecimal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Octal Number: ");
        int octal = sc.nextInt();
        int decimal = 0, temp = octal, base = 1;
        while (temp > 0) {
            int lastdig = temp % 10;
            decimal = decimal + lastdig * base;
            base = base * 8;
            temp = temp / 10;   // FIX: reduce temp
        } System.out.print("Decimal form is: " + decimal);
    }
}
