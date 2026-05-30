package Conversion;

import java.util.*;
class Dec_to_Bin{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:");
        int in = sc.nextInt();
        String bin = " ";
        int rem;
        while (in > 0)
        {
            rem = in%2;
            bin = rem + bin;
            in = in/2;
        }
        System.out.println("Binary form is: "+bin);
    }
}
