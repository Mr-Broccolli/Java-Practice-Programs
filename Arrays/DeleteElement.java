package Arrays;
import java.util.*;
class DeleteElement {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int A[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        System.out.println("Original Array:");
        for(int i = 0; i < n; i++)
            System.out.print(A[i] + " ");
        System.out.println();
        System.out.println("1. Delete by Value");
        System.out.println("2. Delete by Index");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        int pos = -1;
        switch(ch) {
            case 1:
                System.out.print("Enter the value: ");
                int val = sc.nextInt();
                for(int i = 0; i < n; i++) {
                    if(A[i] == val) {
                        pos = i;
                        break;
                    }
                }
                if(pos == -1) {
                    System.out.println("Element not found");
                    return;
                }
                break;
            case 2:
                System.out.print("Enter the index: ");
                pos = sc.nextInt();
                if(pos < 0 || pos >= n) {
                    System.out.println("Invalid Index");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Choice");
                return;
        }
        for(int i = pos; i < n - 1; i++)
            A[i] = A[i + 1];
        System.out.println("New Array:");
        for(int i = 0; i < n - 1; i++)
            System.out.print(A[i] + " ");
    }
}