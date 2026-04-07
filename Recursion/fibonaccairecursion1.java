package Recursion;

import java.util.*;
public class fibonaccairecursion1 {
    //recursive to calculate the nth fibonacci num
    public static int fibo(int n) {
        //base cases-the first two fibonacci numbers are 0and1
        if (n <= 1) {
            return n;
        }
        //recursive case:the nth fibonacci num is the sum of the (n-1)th and (n-2)th
        return fibo(n - 1) + fibo(n - 2);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the num of terms to prin ");
        int count = sc.nextInt(); //number of fibonacci terms to print
        System.out.println("fibonaccai series up to " + count + " terms:");
        //loop to print the fibonacci series
        for (int i = 0; i < count; i++)
        {
            System.out.print(fibo(i) + " ");
        }
    }
}
