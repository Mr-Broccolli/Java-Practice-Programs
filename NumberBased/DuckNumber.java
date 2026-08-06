package NumberBased;
import java.util.*;
class DuckNumber {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        boolean flag = false;
        while(temp > 0) {
            int d = temp % 10;

            if(d == 0)
            {
                flag = true;
                break;
            }

            temp = temp / 10;
        }
        if(flag == true)
            System.out.println(n + " is a Duck Number.");
        else
            System.out.println(n + " is not a Duck Number.");
    }
}