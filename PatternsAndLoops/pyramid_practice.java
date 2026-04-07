package PatternsAndLoops;

import java.util.*;
public class pyramid_practice
{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for half pyramid: ");
        int r = sc.nextInt();
        for (int i = 0; i<r; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=0; i<r; i++) {
            for (int j = 0; j<j+i-1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <i; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
