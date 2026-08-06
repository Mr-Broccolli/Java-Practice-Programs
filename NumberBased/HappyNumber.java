package NumberBased;
import java.util.*;
class HappyNumber {
    boolean isHappy(int n) {
        while(n != 1 && n != 4) {
            int sum = 0;
            while(n > 0) {
                int d = n % 10;
                sum = sum + d * d;
                n /= 10;
            } n = sum;
        } return n == 1;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter minimum limit: ");
        int m = sc.nextInt();
        System.out.println("Enter maximum limit: ");
        int n = sc.nextInt();
        HappyNumber obj = new HappyNumber();
        System.out.println("Happy Numbers are: ");
        for(int i = m; i <= n; i++) {
            if(obj.isHappy(i))
                System.out.print(i + " ");
        }
    }
}