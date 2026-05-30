package ArraysSorting;

 

import java.util.Scanner;

public class MatrixOperations {

    // Function to print matrix
    static void printMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Function to transpose matrix
    static int[][] transpose(int[][] A) {
        int n = A.length;
        int[][] T = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    // Function for 90° rotation (clockwise)
    static int[][] rotate90(int[][] A) {
        int n = A.length;
        int[][] R = new int[n][n];

        // 90° rotation logic
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                R[j][n - 1 - i] = A[i][j];
            }
        }
        return R;
    }

    // Function for 180° rotation
    static int[][] rotate180(int[][] A) {
        int n = A.length;
        int[][] R = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                R[n - 1 - i][n - 1 - j] = A[i][j];
            }
        }

        return R;
    }

    // Function for 270° rotation (clockwise)
    static int[][] rotate270(int[][] A) {
        int n = A.length;
        int[][] R = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                R[n - 1 - j][i] = A[i][j];
            }
        }

        return R;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] M = new int[n][n];

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        printMatrix(M);

        System.out.println("\nTranspose:");
        printMatrix(transpose(M));

        System.out.println("\n90 Degree Rotation:");
        printMatrix(rotate90(M));

        System.out.println("\n180 Degree Rotation:");
        printMatrix(rotate180(M));

        System.out.println("\n270 Degree Rotation:");
        printMatrix(rotate270(M));

        sc.close();
    }
}
