package Recursion;

public class recursion_fabo {
    int c, a=0, b=0;
    static void fabo(int n){
        if(m>=1)
        {
            c = a+b;
            a=b;
            b=c;
            fabo(n-1);
        }
    }
    public static void main(){
        System.out.print(a+" "+b);
        fabo(10);
    }
}
