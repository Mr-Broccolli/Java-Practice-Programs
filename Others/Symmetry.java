package Others;

import java.util.Scanner;
class Symmetry {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter order of square matrix:");
        int n = sc.nextInt(), a[][] = new int[n][n], check = 1;
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < n && check == 1; i++)
            for (int j = 0; j < n; j++)
                if (a[i][j] != a[j][i]) {
                    check = 0;
                    break; }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(a[i][j]+ " ");
            } System.out.println(); }
        if (check == 1)
            System.out.println("Matrix is symmetric");
        else
            System.out.println("Matrix is not symmetric"); } }
