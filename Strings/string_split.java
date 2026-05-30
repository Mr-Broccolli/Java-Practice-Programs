package Strings;

import java.util.Scanner;
public class string_split {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String arr[] = input.split(" "); 
        for(String split : arr)
        {
            System.out.println();
        }
    }
}
