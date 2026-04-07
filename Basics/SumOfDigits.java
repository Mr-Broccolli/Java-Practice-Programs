package Basics;

import java.util.Scanner;
public class SumOfDigits
{
    
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the integer n: ");
        n = sc.nextInt();
        int temp, sum=0;
        temp = n;
        int r=0, s=0;
        while(temp != 0)
        {
            r = temp % 10;
            sum += r;
            temp = temp /10;
        }
        System.out.print(sum);
    }
}
