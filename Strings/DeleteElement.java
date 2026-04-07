package Strings;

import java.util.Scanner;
class DeleteElement {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt(), a[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.print("Enter the element to be deleted: ");
        int x = sc.nextInt(), pos = -1;
        for (int i = 0; i < n; i++)
            if (a[i] == x) {
                pos = i;
                break; }
        if (pos == -1) {
            System.out.println("Element not found");
            return; }
        for (int i = pos; i < n - 1; i++)
            a[i] = a[i + 1];
        System.out.println("Array after deletion:");
        for (int i = 0; i < n - 1; i++)
            System.out.print(a[i] + " "); }
}
