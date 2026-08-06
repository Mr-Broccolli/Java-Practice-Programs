package Arrays;

import java.util.*;
class MatrixMultiplication {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows of Matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Columns of Matrix A: ");
        int c1 = sc.nextInt();
        System.out.print("Rows of Matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Columns of Matrix B: ");
        int c2 = sc.nextInt();
        if(c1!=r2){
            System.out.println("Matrices are not compatible for multiplication.");
            return;
        }
        int A[][] = new int[r1][c1];
        int B[][] = new int[r2][c2];
        System.out.println("Enter Matrix A:");
        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                A[i][j]=sc.nextInt();
        System.out.println("Enter Matrix B:");
        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                B[i][j]=sc.nextInt();
        System.out.println("Matrix A:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++)
                System.out.print(A[i][j]+" ");
            System.out.println();
        }
        System.out.println("Matrix B:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++)
                System.out.print(B[i][j]+" ");
            System.out.println();
        }
        int P[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
            for(int j=0;j<c2;j++)
                for(int k=0;k<c1;k++)
                    P[i][j]+=A[i][k]*B[k][j];
        System.out.println("Product Matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++)
                System.out.print(P[i][j]+" ");
            System.out.println();
        }
    }
}
