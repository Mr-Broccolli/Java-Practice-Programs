package ArraysSorting;

 

import java.util.*;

public class MatrixSortingSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix: ");
        int size = sc.nextInt();
        
        int ar[][] = new int[size][size];
        
        // Input the matrix
        System.out.println("Enter the elements of your matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter element at (" + i + "," + j + "): ");
                ar[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix:");
        display(ar);

        // Whole matrix sorting
        int[][] wholeSorted = copyMatrix(ar);
        sortWholeMatrix(wholeSorted);
        System.out.println("\nMatrix after Whole Sorting:");
        display(wholeSorted);

        // Row-wise sorting
        int[][] rowSorted = copyMatrix(ar);
        sortRows(rowSorted);
        System.out.println("\nMatrix after Row-wise Sorting:");
        display(rowSorted);

        // Column-wise sorting
        int[][] colSorted = copyMatrix(ar);
        sortColumns(colSorted);
        System.out.println("\nMatrix after Column-wise Sorting:");
        display(colSorted);

        sc.close();
    }

    // Function to display the matrix
    static void display(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Copy matrix into another
    static int[][] copyMatrix(int[][] src) {
        int n = src.length;
        int[][] dest = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dest[i][j] = src[i][j];
            }
        }
        return dest;
    }

    // Sort the whole matrix using a flat array
    static void sortWholeMatrix(int[][] mat) {
        int n = mat.length;
        int[] flat = new int[n * n];
        int k = 0;

        // Flatten the matrix into 1D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                flat[k] = mat[i][j];
                k++;
            }
        }

        // Simple sorting (Bubble sort style)
        for (int i = 0; i < flat.length - 1; i++) {
            for (int j = 0; j < flat.length - i - 1; j++) {
                if (flat[j] > flat[j + 1]) {
                    int temp = flat[j];
                    flat[j] = flat[j + 1];
                    flat[j + 1] = temp;
                }
            }
        }

        // Put back into matrix
        k = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = flat[k];
                k++;
            }
        }
    }

    // Sort each row
    static void sortRows(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            // Simple sorting for one row
            for (int j = 0; j < n - 1; j++) {
                for (int k = 0; k < n - j - 1; k++) {
                    if (mat[i][k] > mat[i][k + 1]) {
                        int temp = mat[i][k];
                        mat[i][k] = mat[i][k + 1];
                        mat[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    // Sort each column
    static void sortColumns(int[][] mat) {
        int n = mat.length;
        for (int col = 0; col < n; col++) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (mat[j][col] > mat[j + 1][col]) {
                        int temp = mat[j][col];
                        mat[j][col] = mat[j + 1][col];
                        mat[j + 1][col] = temp;
                    }
                }
            }
        }
    }
}
