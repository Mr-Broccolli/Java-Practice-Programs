package Arrays;
import java.util.*;
class Diagonal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of matrix: ");
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
        System.out.println("1. Primary Diagonal");
        System.out.println("2. Secondary Diagonal");
        System.out.println("3. Both Diagonals");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        int sum = 0;
        switch(ch) {
            case 1:
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        if(i == j) {
                            System.out.print(A[i][j] + " ");
                            sum += A[i][j];
                        }
                        else
                            System.out.print("- ");
                    }
                    System.out.println();
                }
                System.out.println("Sum = " + sum);
                break;
            case 2:
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        if(i + j == n - 1) {
                            System.out.print(A[i][j] + " ");
                            sum += A[i][j];
                        }
                        else
                            System.out.print("- ");
                    }
                    System.out.println();
                }
                System.out.println("Sum = " + sum);
                break;
            case 3:
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        if(i == j || i + j == n - 1) {
                            System.out.print(A[i][j] + " ");
                            sum += A[i][j];
                        }
                        else
                            System.out.print("- ");
                    }
                    System.out.println();
                }
                System.out.println("Sum = " + sum);
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}