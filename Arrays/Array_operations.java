package Arrays;

import java.util.Scanner;
public class Array_operations
{
    //printing matrix
    static void printMatrix(int[][] A)
    {
        for (int i = 0; i < A.length; i++)
        {
            for (int j = 0; j < A[0].length; j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

    //transpose of matrix
    static int[][] transpose(int[][] A)
    {
        int n = A.length;
        int[][] T = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                T[j][i] = A[i][j];
            }
        }
        return T;
    }

    //90 rotation (clockwise)
    static int[][] rotate90(int[][] A)
    {
        int n = A.length;
        int[][] R = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                R[j][n - 1 - i] = A[i][j];
            }
        }
        return R;
    }

    //180 rotation
    static int[][] rotate180(int[][] A)
    {
        int n = A.length;
        int[][] R = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                R[n - 1 - i][n - 1 - j] = A[i][j];
            }
        }
        return R;
    }

    //270 rotation (clockwise)
    static int[][] rotate270(int[][] A)
    {
        int n = A.length;
        int[][] R = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                R[n - 1 - j][i] = A[i][j];
            }
        }
        return R;
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        //taking input size
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] M = new int[n][n];
        //taking input for elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                M[i][j] = sc.nextInt();
            }
        }
        
        //printing final matrices
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTranspose:");
        int[][] transposeMatrix = transpose(M);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n90 Degree Rotation:");
        int[][] rotate90Matrix = rotate90(M);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotate90Matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n180 Degree Rotation:");
        int[][] rotate180Matrix = rotate180(M);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotate180Matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n270 Degree Rotation:");
        int[][] rotate270Matrix = rotate270(M);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotate270Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
