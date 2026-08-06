package NumberBased;
import java.util.*;
class EvilNumber {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int bin;
        int sum = 0;
        while(temp > 0) {
            bin = temp % 2;
            sum = sum + bin;
            temp = temp / 2;
        }
        if(sum % 2 == 0)
            System.out.println(n + " is an Evil Number.");
        else
            System.out.println(n + " is not an Evil Number.");
    }
}