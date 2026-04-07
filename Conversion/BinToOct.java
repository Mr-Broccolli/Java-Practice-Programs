package Conversion;

import java.util.Scanner;
class BinToOct {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = sc.next();
        //Binary to Decimal
        int decimal = 0;
        int base = 1;
        int temp;
        for (int i = binary.length() - 1; i >= 0; i--) {
            temp = binary.charAt(i) - '0';   // char to int
            decimal = decimal + temp * base;
            base = base * 2;
        }
        //Decimal to Octal
        String octal = "";
        int tempDec = decimal;
        while (tempDec > 0) {
            int remainder = tempDec % 8;
            octal = remainder + octal;
            tempDec = tempDec / 8;
        } System.out.println("Octal value: " + octal);
    }
}
