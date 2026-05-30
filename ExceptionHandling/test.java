package ExceptionHandling;

public class test
{
    void divide(int a, int b) throws ArithmeticException
    {
        a=10;
        b=0;
        if (b == 0)
        {
            throw new ArithmeticException("division by 0 is unim-not-possible");
        }
        System.out.println("Result: " +a/b);
    }
    public static void main()
        {
            test obj = new test();
            try {
                obj.divide(10,0);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Message output" +getmess     age());
            }
        }
    }
