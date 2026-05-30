package ExceptionHandling;

public class no_exception
{
    public static void main()
    {
        int a=0;
        try{
        a=50/0;
         System.out.println(a);
        }catch(Exception E)
        {
            System.out.println("0 se division unpossible");
            a=50/10;
            System.out.println(a);
        System.out.println("Sayonaara");
         }
    }
}
