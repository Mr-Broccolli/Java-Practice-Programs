package Others;

public class nestedtry
{
    public static void main()
    {
        int a[] = new int [10];
        int b;
        try
        {
            try
            {
                System.out.println("arithmetic exception example:");
                b = 67/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("0 se division unimunpossible");
            }
            a[14] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("thoda kam karo");
            }
            finally
            {
                System.out.println("Ended Succcesfully!");
            }
    }
}
