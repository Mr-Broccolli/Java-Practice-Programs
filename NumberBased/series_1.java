package NumberBased;

class series_1
{
    public static void main(int n)
    {
        double S = 0.0;
        double a = 1.0;
        for(double i = 1; i<=n; i=i++)
        {
            S = S + 1/++a;
        }
        System.out.println(S);
    }
}
