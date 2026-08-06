package Arrays;
import java.util.*;
class Mixer {
    int arr[];
    int n;
    Mixer(int nn) {
        n = nn;
        arr = new int[n];
    }
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }
    boolean check(int i) {
        if(i == n - 1)
            return true;
        if(arr[i] > arr[i + 1])
            return false;
        return check(i + 1);
    }
    Mixer mix(Mixer A) {
        Mixer X = new Mixer(n + A.n);
        merge(0, 0, 0, A, X);
        return X;
    }
    void merge(int i, int j, int k, Mixer A, Mixer X) {
        if(i == n) {
            copy2(j, k, A, X);
            return;
        }
        if(j == A.n) {
            copy1(i, k, X);
            return;
        }
        if(arr[i] <= A.arr[j]) {
            X.arr[k] = arr[i];
            merge(i + 1, j, k + 1, A, X);
        }
        else {
            X.arr[k] = A.arr[j];
            merge(i, j + 1, k + 1, A, X);
        }
    }
    void copy1(int i, int k, Mixer X) {
        if(i == n)
            return;
        X.arr[k] = arr[i];
        copy1(i + 1, k + 1, X);
    }
    void copy2(int j, int k, Mixer A, Mixer X) {
        if(j == A.n)
            return;
        X.arr[k] = A.arr[j];
        copy2(j + 1, k + 1, A, X);
    }
    void display() {
        System.out.println("Merged Array:");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        Mixer A = new Mixer(n1);
        A.accept();
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        Mixer B = new Mixer(n2);
        B.accept();
        if(!A.check(0) || !B.check(0)) {
            System.out.println("Arrays are not sorted.");
            return;
        }
        Mixer C = A.mix(B);
        C.display();
    }
}