package PatternsAndLoops;

public class Pattern_2
{
    public static void mian()
    {
        int c=1;
        int a,b;
        for(a=1; a<=5; a++)
        {
            for(b=c; b>=1; b=b-2)
            {
                System.out.println(b);
            }
            System.out.println();
        }
    }
}
