package ExceptionHandling;

public class multiple
{
    public static void main(String args[])
    {
        int ar[]=new int[4];
         try{
            ar[67]=69/0;
          }
          catch(ArrayIndexOutOfBoundsException e)
          {
            System.out.println(e);
          }
         catch(ArithmeticException e)
         {
            System.out.println(e);
         }
         finally{
             System.out.println("dsvd");
    }
}
}
