package NumberBased;
import java.util.*;
class Kaprekar {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sq = n * n;
        int temp = sq, d = 0;
        while(temp > 0) {
            d++;
            temp /= 10;
        }
        int p = (int)Math.pow(10, d / 2);
        int l = sq / p;
        int r = sq % p;
        if(r != 0 && l + r == n)
            System.out.println(n + " is a Kaprekar Number.");
        else
            System.out.println(n + " is not a Kaprekar Number.");
    }
}