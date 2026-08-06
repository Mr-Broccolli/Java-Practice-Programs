package Arrays;
import java.util.*;
class SumMaxMin {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int A[][] = new int[r][c];
        int sum = 0;
        System.out.println("Enter the matrix:");
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();
        int max = A[0][0];
        int min = A[0][0];
        System.out.println("Original Matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                System.out.print(A[i][j] + " ");
                sum += A[i][j];
                if(A[i][j] > max)
                    max = A[i][j];
                if(A[i][j] < min)
                    min = A[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}