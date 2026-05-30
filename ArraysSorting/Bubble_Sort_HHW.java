package ArraysSorting;

import java.util.Scanner;
class Bubble_Sort_HHW {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of matrix: ");
        int M = sc.nextInt();
        if(M <= 3 || M >= 20){
            System.out.println("Invalid input");
            return;
        }
        int A[][] = new int[M][M];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < M; i++){
            for(int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nOriginal Matrix:");
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(A[i][j] + "\t");
            }  System.out.println();
        }
        for(int i = 0; i < M; i++) {
            for(int pass = 0; pass < M - 1; pass++)
            {
                for(int j = 0; j < M - 1 - pass; j++)
                {
                    if(A[i][j] > A[i][j + 1])
                    {
                        int temp = A[i][j];
                        A[i][j] = A[i][j + 1];
                        A[i][j + 1] = temp;
                    }
                }
            }
        }
        System.out.println("\nSorted Matrix:");
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M; j++)
            {
                System.out.print(A[i][j] + "\t");
            } System.out.println();
        }
    }
}
