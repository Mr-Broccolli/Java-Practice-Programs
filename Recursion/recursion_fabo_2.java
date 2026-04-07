package Recursion;

public class recursion_fabo_2
{
    int fabo(int n)
    {
        if(n==0) {
            return 0;
        }
        else if(n==1) {
            return 1;
        }
        else {
            return (n-1) + (n-2);
        } n = 5;
        recursion_fabo_2 obj = new recursion_fabo_2();
        for (int i=0; i<n; i++)
        {
            System.out.println(obj.fabo(i));
        }
    }
}
