package Conversion;

import java.util.*;
class Dec_to_Oct{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Decimal Number:");
        int in = sc.nextInt();
        String Oct = " ";
        int rem;
        while (in > 0)
        {
            rem = in%8;
            Oct = rem + Oct;
            in = in/8;
        }
        System.out.println("Octal form is: "+Oct);
    }
}
