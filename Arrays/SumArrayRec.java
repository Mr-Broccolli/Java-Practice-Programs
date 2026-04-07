package Arrays;

import java.util.Scanner;
class SumArrayRec
{
    static int sum;
    static void calculate(int a[], int n)
    {
        if (n == 0)
            return;
        sum += a[n - 1];
        calculate(a, n - 1);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        //reset static variable
        sum = 0;
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        calculate(a, n);
        System.out.println("Sum of array elements = " + sum);
    }
}
