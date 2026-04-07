package Conversion;

import java.util.*;
class DecimalFracToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double num = sc.nextDouble();
        int intPart = (int) num;
        double fracPart = num - intPart;
        //Convert integer part
        String intBinary = "";
        if (intPart == 0) {
            intBinary = "0";
        } else {
            while (intPart > 0) {
                intBinary = (intPart % 2) + intBinary;
                intPart = intPart / 2;
            }
        }
        //Convert fractional part
        String fracBinary = "";
        int count = 0;
        while (fracPart > 0 && count < 8) {
            fracPart = fracPart * 2;
            int bit = (int) fracPart;
            fracBinary = fracBinary + bit;
            fracPart = fracPart - bit;
            count++;
        }
        System.out.println("Binary form is: " + intBinary + "." + fracBinary);
        sc.close();
    }
}
