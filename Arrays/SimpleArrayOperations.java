package Arrays;

import java.util.*;

public class SimpleArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Sum of each row
        System.out.println("\nSum of each row:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum = rowSum + arr[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + rowSum);
        }

        // Sum of each column
        System.out.println("\nSum of each column:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum = colSum + arr[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }

        // Sum of boundary elements
        int boundarySum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    boundarySum = boundarySum + arr[i][j];
                }
            }
        }
        System.out.println("\nSum of boundary elements: " + boundarySum);

        // Sum of diagonals (only for square matrix)
        if (rows == cols) {
            int leftDiagonal = 0;
            int rightDiagonal = 0;

            for (int i = 0; i < rows; i++) {
                leftDiagonal = leftDiagonal + arr[i][i]; // top-left to bottom-right
                rightDiagonal = rightDiagonal + arr[i][cols - i - 1]; // top-right to bottom-left
            }

            System.out.println("\nSum of left diagonal: " + leftDiagonal);
            System.out.println("Sum of right diagonal: " + rightDiagonal);
        } else {
            System.out.println("\nDiagonals can only be found in square matrix.");
        }

        // Transpose of the matrix
        System.out.println("\nTranspose of the matrix:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
