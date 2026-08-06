package Arrays;
import java.util.*;
class CircularPrime {
    int n;
    CircularPrime(int nn) {
        n = nn;
    }
    boolean isPrime(int x, int i) {
        if(x < 2)
            return false;
        if(i > Math.sqrt(x))
            return true;
        if(x % i == 0)
            return false;
        return isPrime(x, i + 1);
    }
    int digits(int x) {
        if(x == 0)
            return 0;
        return 1 + digits(x / 10);
    }
    boolean check(int x, int c) {
        if(c == 0)
            return true;
        System.out.println(x);
        if(!isPrime(x, 2))
            return false;
        int d = digits(x);
        int p = (int)Math.pow(10, d - 1);
        x = (x % p) * 10 + x / p;
        return check(x, c - 1);
    }
    void display() {
        if(check(n, digits(n)))
            System.out.println(n + " is a Circular Prime.");
        else
            System.out.println(n + " is not a Circular Prime.");
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        CircularPrime obj = new CircularPrime(n);
        obj.display();
    }
}