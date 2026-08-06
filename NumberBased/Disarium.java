package NumberBased;
import java.util.*;
class Disarium {
    int power(int n, int p) {
        int x = 1;
        for(int i = 1; i <= p; i++)
            x = x * n;
        return x;
    }
    boolean isDisarium(int n) {
        int temp = n, d = 0;
        while(temp > 0) {
            d++;
            temp /= 10;
        }
        temp = n;
        int sum = 0;
        while(temp > 0) {
            int r = temp % 10;
            sum = sum + power(r, d);
            d--;
            temp /= 10;
        }
        return sum == n;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        Disarium obj = new Disarium();
        if(obj.isDisarium(n))
            System.out.println(n + " is a Disarium Number.");
        else
            System.out.println(n + " is not a Disarium Number.");
    }
}