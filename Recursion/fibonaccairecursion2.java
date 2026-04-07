package Recursion;

class fibonaccairecursion2 {
    int c, a=0, b=1;
    static int fibo(int m)
    {
        
        if(m >= 1) {
            c = a +b;
            System.out.println(c);
            a = b;
            b = c;
            fibo(m-1);
        }
    }
    public static void main()
    {
        System.out.print(a + " " +b);
        fibo(10);
    }
}
