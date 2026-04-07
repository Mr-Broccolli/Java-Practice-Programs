package Others;

import java.util.*;
class menu
{
    static Scanner sc = new Scanner(System.in);
    public static void main()
    {
        System.out.println("Enter num 1, num 2");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter menu code");
        char ch = sc.next().charAt(0);
        if(ch == 'A')
        {
            int Add = a+b;
            System.out.println("Addition = "+Add);
        }
        if(ch == 'S')
        {
            int Sub = a-b;
            System.out.println("Subtraction = "+Sub);
        }
        if(ch == 'M')
        {
            int Mult = a*b;
            System.out.println("Multiplication = "+Mult);
        }
        if(ch == 'D')
        {
            double divd = a/b;
            System.out.println("Division = "+divd);
        }
    }
}
