package Conversion;

import java.util.Scanner;
public class bin_to_dec {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your binary number: ");
        String bin = sc.nextLine();

        // Convert binary to decimal
        int decimal = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            // Extract each character from the binary string
            char bit = binaryString.charAt(length - 1 - i);

            // Convert character to integer and calculate its decimal value
            if (bit == '1') {
                decimal += Math.pow(2, i);
            }
        }

        // Output the decimal equivalent
        System.out.println("Decimal equivalent: " + decimal);

        scanner.close();
    }
}
