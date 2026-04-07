package NumberBased;

import java.util.Scanner;
public class smith_number
{
    
    public int input(int n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer n: ");
        n = sc.nextInt();
    }
    int temp=n, sum=0;
    public int SumOfDigit(int n)
    {
        temp = n % 10;
        sum+=temp;
        n=n/10;
    }
    public int factor()
    {
        for(int i=0; i<n; )
