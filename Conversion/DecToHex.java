package Conversion;

import java.util.Scanner;
class DecToHex {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int m = sc.nextInt(),r;
        String hex = "";
        while (m != 0) {
            r = m % 16;
            if (r >= 10 && r <= 15) {
                if (r == 10)
                    hex = 'A' + hex;
                else if (r == 11)
                    hex = 'B' + hex;
                else if (r == 12)
                    hex = 'C' + hex;
                else if (r == 13)
                    hex = 'D' + hex;
                else if (r == 14)
                    hex = 'E' + hex;
                else if (r == 15)
                    hex = 'F' + hex;
            } else {
                hex = r + hex;
            }
            m = m / 16;
        } System.out.print("Hexadecimal equivalent: " + hex);
    }
}
