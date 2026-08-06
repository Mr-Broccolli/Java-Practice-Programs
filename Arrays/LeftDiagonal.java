package Arrays;
import java.util.*;
class LeftDiagonal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of the matrix: ");
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
        System.out.println("Left Diagonal:");
        for(int i = 0; i < n; i++)
            System.out.print(A[i][n - 1 - i] + " ");
    }
}