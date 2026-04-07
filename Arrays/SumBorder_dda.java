package Arrays;

import java.util.Scanner;
class SumBorder_dda
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of square matrix: ");
        int n = sc.nextInt(), a[][] = new int[n][n], sum = 0;
        System.out.println("Enter the elements of matrix: ");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println(); }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1)
                    sum += a[i][j];
        System.out.println("Sum of border elements: " + sum); }
}
