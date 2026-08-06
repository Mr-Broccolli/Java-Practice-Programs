package NumberBased;
import java.util.*;
class NumberConversion {
    int binToDec(long n) {
        int dec = 0, p = 0;
        while(n > 0) {
            int d = (int)(n % 10);
            dec = dec + d * (int)Math.pow(2, p);
            p++;
            n /= 10;
        } return dec;
    }
    void decToBin(int n) {
        String bin = "";
        if(n == 0) {
            System.out.println("Binary = 0");
            return;
        }
        while(n > 0) {
            bin = (n % 2) + bin;
            n /= 2;
        } System.out.println("Binary = " + bin);
    }
    int hexToDec(String h) {
        h = h.toUpperCase();
        int dec = 0, p = 0;
        for(int i = h.length() - 1; i >= 0; i--) {
            char ch = h.charAt(i);
            int d;
            if(ch >= '0' && ch <= '9')
                d = ch - '0';
            else
                d = ch - 55;
            dec = dec + d * (int)Math.pow(16, p);
            p++;
        } return dec;
    }
    void decToHex(int n) {
        String hex = "";
        if(n == 0) {
            System.out.println("Hexadecimal = 0");
            return;
        }
        while(n > 0) {
            int r = n % 16;
            if(r < 10)
                hex = r + hex;
            else
                hex = (char)(r + 55) + hex;
            n /= 16;
        } System.out.println("Hexadecimal = " + hex);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        NumberConversion obj = new NumberConversion();
        System.out.println("1. Decimal to Binary");
        System.out.println("2. Decimal to Hexadecimal");
        System.out.println("3. Binary to Decimal");
        System.out.println("4. Binary to Hexadecimal");
        System.out.println("5. Hexadecimal to Decimal");
        System.out.println("6. Hexadecimal to Binary");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
                System.out.print("Enter Decimal Number: ");
                obj.decToBin(sc.nextInt());
                break;
            case 2:
                System.out.print("Enter Decimal Number: ");
                obj.decToHex(sc.nextInt());
                break;
            case 3:
                System.out.print("Enter Binary Number: ");
                System.out.println("Decimal = " + obj.binToDec(sc.nextLong()));
                break;
            case 4:
                System.out.print("Enter Binary Number: ");
                obj.decToHex(obj.binToDec(sc.nextLong()));
                break;
            case 5:
                System.out.print("Enter Hexadecimal Number: ");
                System.out.println("Decimal = " + obj.hexToDec(sc.next()));
                break;
            case 6:
                System.out.print("Enter Hexadecimal Number: ");
                obj.decToBin(obj.hexToDec(sc.next()));
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}