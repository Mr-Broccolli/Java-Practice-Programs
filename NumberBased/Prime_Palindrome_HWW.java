package NumberBased;

import java.util.*;
class PrimePalindrome {
    boolean isPrime(int n) {
        if(n < 2)
            return false;

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    boolean isPalindrome(int n) {
        int num = n;
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }  return (num == rev);
    }
    void display(int m, int n) {
        if(m >= n || m >= 3000 || n >= 3000) {
            System.out.println("OUT OF RANGE");
            return;
        }
        int count = 0;
        System.out.println("THE PRIME PALINDROME INTEGERS ARE:");
        for(int i = m; i <= n; i++) {
            if(isPrime(i) && isPalindrome(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("FREQUENCY OF PRIME PALINDROME INTEGERS : " + count);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        PrimePalindrome obj = new PrimePalindrome();
        obj.display(m, n);
    }
}
