package Arrays;
import java.util.*;
class OctalToDecimal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();
        int A[][] = new int[r][c];
        System.out.println("Enter the matrix:");
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                A[i][j] = sc.nextInt();
        System.out.println();
        System.out.println("Original Matrix:");
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }
        System.out.println("Decimal Equivalent:");
        for(int i = 0; i < r; i++) {
            int dec = 0;
            int p = 0;
            for(int j = c - 1; j >= 0; j--) {
                dec = dec + A[i][j] * (int)Math.pow(8, p);
                p++;
            }
            System.out.println(dec);
        }
    }
}