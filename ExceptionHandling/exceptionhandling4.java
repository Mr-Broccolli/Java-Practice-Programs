package ExceptionHandling;

public class exceptionhandling4
{
    public static void main()
    {
        int a[] = new int[5];
        try 
        {
            
            a[5] = 69/0;
            int b=67/0;
        }
        
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
