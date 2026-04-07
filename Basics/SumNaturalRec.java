package Basics;

import java.util.Scanner;
class SumNaturalRec {
    static long sum;
    static void calc(long n) {
        if (n == 0)
            return;
        sum += n;
        calc(n - 1);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        //reset static variable
        sum = 0;
        System.out.print("Enter n: ");
        long n = sc.nextLong();
        calc(n);
        System.out.println("Sum of first " + n + " natural numbers = " + sum);
    }
}
