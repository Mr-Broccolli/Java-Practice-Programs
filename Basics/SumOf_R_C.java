package Basics;

import java.util.Scanner;
class SumOf_R_C {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int r = sc.nextInt(), c = sc.nextInt(), a[][] = new int[r][c];
        System.out.println("enter the elements of matrix: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++) {
            int sr = 0;
            for (int j = 0; j < c; j++)
                sr += a[i][j];
            System.out.println("Row " + (i + 1) + ": " + sr); }
        for (int j = 0; j < c; j++) {
            int scn = 0;
            for (int i = 0; i < r; i++)
                scn += a[i][j];
            System.out.println("Column " + (j + 1) + ": " + scn); }
    }
}
