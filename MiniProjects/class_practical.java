package MiniProjects;

import java.util.Scanner;
public class class_practical {
    public static void main() {
        int M;
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        M = sc.nextInt();//input size
        //checking if M fits the conditons
        do {
            if (M <= 3 || M >= 10) {
                System.out.print("M = ");
                M = sc.nextInt();
            }
        } while (M <= 3 || M >= 10);
        //declaring array
        int A[][] = new int[M][M];
        //input elements
        for (int i = 0; i < M; i++) {
            System.out.println("Enter elements for row " + (i + 1) + ":");
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        //printing original matrix
        System.out.println("Original Matrix: ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }
        //sorting each row
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M - 1; j++) {
                for(int k = 0; k < M - 1 - j; k++) {
                    if(A[i][k] > A[i][k + 1]) {
                        int temp = A[i][k];
                        A[i][k] = A[i][k + 1];
                        A[i][k + 1] = temp;
                    }
                }
            }
        }
        //printing rearranged matrix
        System.out.println("Rearranged Matrix:");
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M; j++) {
                System.out.print(A[i][j] + "  ");
            }
            System.out.println();
        }
        
        //diagonal sums
        int principalSum = 0;
        int secondarySum = 0;
        for (int i = 0; i < M; i++) {
            principalSum = principalSum + A[i][i];
            secondarySum = secondarySum + A[i][M - 1 - i];
        }
        int totalSum = principalSum + secondarySum;
        //remove double counted middle element
        if (M % 2 != 0) {
            int center = M/2;
            totalSum = totalSum- A[center][center];
        }
        //print diagonal elements
        System.out.println("Diagonal Elements:");

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (i == j || i + j == M - 1) {
                    System.out.print(A[i][j] + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("\nSum of the diagonal elements = " + totalSum);
    }
}
