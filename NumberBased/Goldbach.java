package NumberBased;
import java.util.*;
class Goldbach {
    boolean isPrime(int n) {
        if(n < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        } return true;
    }
    public void check(int n) {
        if(n <= 2 || n % 2 != 0) {
            System.out.println("Goldbach Number is possible only for even numbers greater than 2.");
            return;
        }
        for(int i = 2; i <= n / 2; i++) {
            if(isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " is a Goldbach Number.");
                System.out.println(i + " + " + (n - i) + " = " + n);
                return;
            }
        } System.out.println(n + " is not a Goldbach Number.");
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Goldbach obj = new Goldbach();
        obj.check(n);
    }
}