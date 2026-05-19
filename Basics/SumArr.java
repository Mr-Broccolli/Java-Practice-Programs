package Basics;
import java.util.Scanner;
public class SumArr {
    int n;
    int arr[];
    SumArr(int nn) {
        n = nn;
        arr = new int[n];
    }
    void Accept() {
        Scanner sc = new Scanner(System.in);
        int x ;
        for(int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    void add(SumArr A, SumArr B) {
        for(int i = 0; i<n; i++) {
            arr[i] = A.arr[i] + B.arr[i];
        }
    }
    void display() {
        System.out.println("Result array:");
        for(int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }
    //main method
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        SumArr obj1 = new SumArr(size);
        SumArr obj2 = new SumArr(size);
        SumArr result = new SumArr(size);

        System.out.println("Enter elements for first array:");
        obj1.Accept();

        System.out.println("Enter elements for second array:");
        obj2.Accept();

        result.add(obj1, obj2);
        result.display();
    }
}