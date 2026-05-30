package Arrays;
import java.util.Scanner;
public class Mixer {
    int arr[];
    int n;

    Mixer(int nn) {
        n = nn;
        arr = new int[n];
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n - 1; i++)
            for(int j = 0; j < n - i - 1; j++)
                if(arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    Mixer mix(Mixer A) {
        Mixer result = new Mixer(n + A.n);
        int i = 0, j = 0, k = 0;

        while(i < n && j < A.n) {
            if(arr[i] < A.arr[j])
                result.arr[k++] = arr[i++];
            else if(arr[i] > A.arr[j])
                result.arr[k++] = A.arr[j++];
            else {
                result.arr[k++] = arr[i++];
                j++;
            }
        }

        while(i < n)
            result.arr[k++] = arr[i++];

        while(j < A.n)
            result.arr[k++] = A.arr[j++];

        result.n = k;
        return result;
    }
    void display() {
        System.out.println("Mixed sorted array:");
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        Mixer A = new Mixer(sc.nextInt());
        A.accept();
        System.out.print("Enter size of second array: ");
        Mixer B = new Mixer(sc.nextInt());
        B.accept();

        Mixer C = A.mix(B);
        C.display();
    }
}
