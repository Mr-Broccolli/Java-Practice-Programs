package Arrays;
import java.util.*;
class ArraySum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of arrays: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[n];
        int C[] = new int[n];
        System.out.println("Enter the first array:");
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.println("Enter the second array:");
        for(int i = 0; i < n; i++)
            B[i] = sc.nextInt();
        System.out.println("First Array:");
        for(int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println();
        System.out.println("Second Array:");
        for(int i = 0; i < n; i++)
            System.out.print(B[i] + " ");
        System.out.println();
        for(int i = 0; i < n; i++)
            C[i] = A[i] + B[i];
        System.out.println("Sum Array:");
        for(int i = 0; i < n; i++)
            System.out.print(C[i] + " ");
    }
}