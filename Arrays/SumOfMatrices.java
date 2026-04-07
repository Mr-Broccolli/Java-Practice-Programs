package Arrays;

import java.util.Scanner;
class SumOfMatrices
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of square matrix: ");
        int n = sc.nextInt(), a[][] = new int[n][n], b[][] = new int[n][n], sum[][] = new int[n][n];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();
        System.out.println("elements of first matrix:");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(a[i][j]); }
            System.out.println(); }
        System.out.println("elements of second matrix:");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(b[i][j]); }
            System.out.println(); }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum[i][j] = a[i][j] + b[i][j];
        System.out.println("Sum of the two matrices:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(sum[i][j] + "\t");
            System.out.println(); }
    }
}
