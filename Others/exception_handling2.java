package Others;


class exception_handling2 {
    public static void main() {
        int a=0; String example; int ar[] = new int[10]; int b;
        try
        {
            a = 67/0;
            example = null;
            ar[15]=67;
            b = example.length();
        }
        
        catch(Exception e)
        {
            System.out.println("cannot divide by 0");
            System.out.println("rest of the code");
        }
    }
}
