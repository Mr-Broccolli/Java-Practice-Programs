package Strings;

import java.util.*;
public class reverse_recursion {
    
    // Recursive method
    static int reverseNumber(int n, int rev) {
        if (n == 0) {
            return rev;
        }
        return reverseNumber(n / 10, rev * 10 + (n % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to reverse: ");
        int n = sc.nextInt();

        int reversed = reverseNumber(n, 0);

        System.out.println("Reversed number: " + reversed);
    }
}
