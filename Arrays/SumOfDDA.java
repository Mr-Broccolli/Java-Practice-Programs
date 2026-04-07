package Arrays;

import java.util.Scanner;
class SumOfDDA
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        int sum = 0;
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum += a[i][j];
        System.out.println("Sum of all elements: " + sum);
    }
}
