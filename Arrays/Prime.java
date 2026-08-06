package Arrays;
import java.util.*;
class Prime {
    int n;
    Prime(int nn) {
        n = nn;
    }
    boolean check(int i) {
        if(n < 2)
            return false;
        if(i > Math.sqrt(n))
            return true;
        if(n % i == 0)
            return false;
        return check(i + 1);
    }
    void display() {
        if(check(2))
            System.out.println(n + " is a Prime Number.");
        else
            System.out.println(n + " is not a Prime Number.");
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Prime obj = new Prime(n);
        obj.display();
    }
}