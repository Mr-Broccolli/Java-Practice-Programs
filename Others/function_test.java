package Others;

import java.util.*;

public class function_test {
    public static void main() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose one, 1 or 2: ");
        n = sc.nextInt();
        String message = func(n);
        System.out.println(message);
    }
    
    static String func(int n) {
        String greeting = (n == 1) ? "How are you?" : "Hello!";
        return greeting;
    }
}
