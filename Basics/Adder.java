package Basics;
import java.util.Scanner;
public class Adder {
    int a[];

    Adder() {
        a = new int[2];
    }

    void readtime() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Time in Hour: ");
        a[0] = sc.nextInt();
        System.out.print("Enter Time in Minute: ");
        a[1] = sc.nextInt();
    }

    void addtime(Adder X, Adder Y) {
        a[0] = X.a[0] + Y.a[0];
        a[1] = X.a[1] + Y.a[1];

        if(a[1] >= 60) {
            a[0] += a[1] / 60;
            a[1] %= 60;
        }
    }

    void disptime() {
        System.out.println("Hours = " + a[0]);
        System.out.println("Minutes = " + a[1]);
    }

    public static void main() {
        Adder X = new Adder();
        Adder Y = new Adder();
        Adder Z = new Adder();

        System.out.println("Enter first time:");
        X.readtime();
        System.out.println("Enter second time:");
        Y.readtime();
        Z.addtime(X, Y);

        System.out.println("Total Time:");
        Z.disptime();
    }
}