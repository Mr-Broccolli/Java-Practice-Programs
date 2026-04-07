package Matrix;

import java.util.Arrays;
import java.util.Scanner;
public class MatrixOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M;
        //Allow the user to input the size M with constraints
        do {
            System.out.print("ENTER MATRIX SIZE (M must be > 3 and < 10): ");
            M = in.nextInt();
            if (M <= 3 || M >= 10) {
                System.out.println("THE MATRIX SIZE IS OUT OF RANGE. Please try again.");
            }
        } while (M <= 3 || M >= 10);
        int[][] A = new int[M][M];
        System.out.println("ENTER POSITIVE INTEGER ELEMENTS OF MATRIX:");
        // Input positive integers into the matrix
        for (int i = 0; i < M; i++) {
            System.out.println("ENTER ELEMENTS FOR ROW " + (i + 1) + ":");
            for (int j = 0; j < M; j++) {
                int element;
                do {
                    element = in.nextInt();
                    if (element <= 0) {
                        System.out.println("INVALID INPUT: Please enter a positive integer.");
                    }
                } while (element <= 0);
                A[i][j] = element;
            }
        }
        //creating a copy of the original matrix to display later
        int[][] originalMatrix = new int[M][M];
        for (int i = 0; i < M; i++) {
            System.arraycopy(A[i], 0, originalMatrix[i], 0, M);
        }
        //sort the row-wise elements in ascending order and rearrange the matrix
        for (int i = 0; i < M; i++) {
            Arrays.sort(A[i]); // Using the built-in sort method
        }
        //calculate the sum of the diagonals of the rearranged matrix
        int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < M; i++) {
            principalDiagonalSum += A[i][i]; //elements where row index == column index
            secondaryDiagonalSum += A[i][M - 1 - i]; //elements where row + column == M - 1
        }
        int totalDiagonalSum = principalDiagonalSum + secondaryDiagonalSum;
        //adjust total sum for the center element if M is odd to avoid double-counting
        if (M % 2 != 0) {
            int centerIndex = M / 2;
            totalDiagonalSum -= A[centerIndex][centerIndex];
        }
        //isplay the results
        System.out.println("\nORIGINAL MATRIX");
        displayMatrix(originalMatrix, M);
        System.out.println("\nREARRANGED MATRIX (Row-wise Sorted)");
        displayMatrix(A, M);
        System.out.println("\ndIAGONAL ELEMENTS OF REARRANGED MATRIX");
        displayDiagonalElements(A, M);
        System.out.println("Sum of all diagonal elements: " + totalDiagonalSum);
        in.close();
    }
    public static void displayMatrix(int[][] matrix, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void displayDiagonalElements(int[][] matrix, int size) {
        System.out.println("Principal Diagonal Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][i] + "\t");
        }
        System.out.println("\nSecondary Diagonal Elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(matrix[i][size - 1 - i] + "\t");
        }
        System.out.println();
    }
}
