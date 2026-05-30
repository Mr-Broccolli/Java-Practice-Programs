package Arrays;

import java.util.Scanner;
class Transpose {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter number of columns:");
        int m = sc.nextInt(), a[][] = new int[n][m], copy[][] = new int[m][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println(); }
        System.out.println("Transpose of the Matrix:");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                copy[j][i] = a[i][j];
                System.out.print(copy[j][i] + "\t"); }
            System.out.println(); }
    }
}
