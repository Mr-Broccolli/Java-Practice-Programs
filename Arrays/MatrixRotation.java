package Arrays;
import java.util.*;
class MatrixRotation {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of matrix: ");
        int n = sc.nextInt();
        int A[][] = new int[n][n];
        System.out.println("Enter the matrix:");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = sc.nextInt();
        System.out.println("Original Matrix:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
        System.out.println("90 Degree Clockwise Rotation:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(A[n - 1 - j][i] + " ");
            System.out.println();
        }
        System.out.println("90 Degree Anticlockwise Rotation:");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
                System.out.print(A[j][n - 1 - i] + " ");
            System.out.println();
        }
    }
}