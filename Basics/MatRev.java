package Basics;
import java.util.Scanner;
public class MatRev {
    int arr[][];
    int m, n;
    MatRev(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }
    void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
    int reverse(int x) {
        int rev = 0;
        while(x != 0) {
            rev = rev * 10 + (x % 10);
            x = x / 10;
        }
        return rev;
    }
    void revMat(MatRev P) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = reverse(P.arr[i][j]);
            }
        }
    }
    void show() {
        System.out.println("Matrix:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        MatRev P = new MatRev(r, c);
        MatRev R = new MatRev(r, c);

        System.out.println("Enter original matrix:");
        P.fillarray();

        R.revMat(P);

        System.out.println("Original Matrix:");
        P.show();

        System.out.println("Reversed Matrix:");
        R.show();
    }
}