package Recursion;

import java.util.*;
public class factorial_recursion {
    int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main()
    {
        factorial_recursion obj = new factorial_recursion();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        System.out.println("Factorial: " +obj.fact(n));
    }
    
}
