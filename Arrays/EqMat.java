package Arrays;
import java.util.Scanner;
public class EqMat {
    int a[][];
    int m, n;

    EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        a = new int[m][n];

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = 0;
    }

    void readarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements:");
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    int check(EqMat P, EqMat Q) {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(P.a[i][j] != Q.a[i][j])
                    return 0;
            }
        }
        return 1;
    }

    void print() {
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        EqMat P = new EqMat(r, c);
        EqMat Q = new EqMat(r, c);
        EqMat R = new EqMat(r, c);

        System.out.println("Enter first matrix:");
        P.readarray();

        System.out.println("Enter second matrix:");
        Q.readarray();

        System.out.println("First Matrix:");
        P.print();

        System.out.println("Second Matrix:");
        Q.print();

        if(R.check(P, Q) == 1)
            System.out.println("Matrices are Equal");
        else
            System.out.println("Matrices are Not Equal");
    }
}
