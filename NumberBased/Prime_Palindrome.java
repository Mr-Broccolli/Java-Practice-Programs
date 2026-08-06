package NumberBased;
import java.util.Scanner;
class Prime_Palindrome {
    boolean isPrime(int n) {
        if(n < 2){
            return false
        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    
    boolean isPalindrome(int n) {
        int num = 0;
        int rev = 0;
        while(n>0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        
    }
    
    void display(int m, int n) {
        if(m >= n || n >= 3000 || m >= 3000) {
            System.out.println("Out Of Range");
            return;
        }
        System.out.println("The Prime Palindrome Integers are: ");
        int count = 0;
        for(int i = m; i <= n; i++) {
            
        }
    }
    
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        Prime_Palindrome obj = new Prime_Palindrome();
        obj.display(m, n);
    }
}