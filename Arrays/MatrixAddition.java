package Arrays;
import java.util.*;
class MatrixAddition {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r1 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c1 = sc.nextInt();
        System.out.print("Enter number of rows: ");
        int r2 = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c2 = sc.nextInt();
        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        if(r1 != r2 || c1 != c2) {
            System.out.println("Matrices are not compatible for addition.");
            return;
        }
        System.out.println("Enter Matrix A:");
        for(int i = 0; i < r1; i++)
            for(int j = 0; j < c1; j++)
                A[i][j] = sc.nextInt();
        System.out.println("Enter Matrix B:");
        for(int i = 0; i < r2; i++)
            for(int j = 0; j < c2; j++)
                B[i][j] = sc.nextInt();
        System.out.println("Matrix A:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
        System.out.println("Matrix B:");
        for(int i = 0; i < r2; i++) {
            for(int j = 0; j < c2; j++)
                System.out.print(B[i][j] + " ");
            System.out.println();
        }
        int C[][] = new int[r1][c1];
        for(int i = 0; i < r1; i++)
            for(int j = 0; j < c1; j++)
                C[i][j] = A[i][j] + B[i][j];
        System.out.println("Sum Matrix:");
        for(int i = 0; i < r1; i++) {
            for(int j = 0; j < c1; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }
    }
}