package Conversion;

import java.util.*;

class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int in = sc.nextInt();

        if (in == 0) {
            System.out.println("Binary form is: 0");
            return;
        }

        String bin = "";
        int rem;

        while (in > 0) {
            rem = in % 2;
            bin = rem + bin;
            in = in / 2;
        }

        System.out.println("Binary form is: " + bin);
        sc.close();
    }
}
