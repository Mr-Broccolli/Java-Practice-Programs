package NumberBased;

import java.util.*;
class series
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        double i;
        double s = 0.0;
        System.out.println("Enter the number");
        int n = in.nextInt();
        for(i=1; i<=n; i++)
        {
            int x = 1;
            for(int b=1; b<=i; b++)
            {
                x = x * b;
            }
            System.out.println("factorial ="+x);
            s= s+1.0/x;
        }
        System.out.println(s);
    }
}
