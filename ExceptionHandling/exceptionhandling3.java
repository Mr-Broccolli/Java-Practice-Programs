package ExceptionHandling;

public class exceptionhandling3
{
    public static void main()
    {
        try
        {
            int data  = 50/0;
            
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
