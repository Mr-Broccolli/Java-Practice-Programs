package ArraysSorting;

 

import java.util.Scanner;
class BubbleSortDDA
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt(), a[][] = new int[n][n], total = n * n;
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        for (int pass = 0; pass < total - 1; pass++)
            for (int k = 0; k < total - pass - 1; k++) {
                int r1 = k % n;
                int c1 = k / n;
                int r2 = (k + 1) % n;
                int c2 = (k + 1) / n;
                if (a[r1][c1] > a[r2][c2]) {
                    int temp = a[r1][c1];
                    a[r1][c1] = a[r2][c2];
                    a[r2][c2] = temp; }
            }
        System.out.println("Sorted matrix(col-wise order):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println(); }
    }
}
