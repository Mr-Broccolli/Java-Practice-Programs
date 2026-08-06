package Arrays;
import java.util.*;
class Power {
    int b, e;
    Power(int bb, int ee) {
        b = bb;
        e = ee;
    }
    int power(int n) {
        if(n == 0)
            return 1;
        return b * power(n - 1);
    }
    void display() {
        System.out.println("Answer = " + power(e));
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int b = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int e = sc.nextInt();
        if(e < 0) {
            System.out.println("Invalid Exponent");
            return;
        }
        Power obj = new Power(b, e);
        obj.display();
    }
}