package Conversion;

import java.util.Scanner;
class bin2dec {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number: ");
        String bin = sc.nextLine();
        //converting binary to decimal
        int decimal = 0;
        int length = bin.length();
        for (int i = 0; i < length; i++) {
            //extracting each character from the binary string
            char bit = bin.charAt(length - 1 - i);
            //convert character to integer and calculating its decimal value
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }
        //outputting the decimal equivalent
        System.out.println("Decimal equivalent: " + decimal);
    }
}
