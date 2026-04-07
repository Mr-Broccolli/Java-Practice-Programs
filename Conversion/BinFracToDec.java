package Conversion;

import java.util.*;
public class BinFracToDec {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fractional binary number: ");
        String binary = sc.nextLine();
        String[] parts = binary.split("\\.");
        String intParts = parts [0];
        String fracPart = parts.length > 1 ? parts [1]: "";
        double decimal = 0.0;
        int base = 0;
        for(int i = intPart.length()-1; i >= 0; i--)
        {
            if(intPart.chatAt(i) ==  '1') {
                decimal += Math.pow(2, base);
            }
            base++;
        }
        for(int i = 0; i < fracPart.length(); i++)
        {
            if(fracPart.charAt(i) == '1') {
                decimal += Math.pow(2, -(i+1));
            }
        }
        System.out.print("Decimal Equivalent: "+decimal);
    }
}
