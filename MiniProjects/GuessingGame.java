package MiniProjects;

import java.util.Scanner;
class GuessingGame {
    public int generateRandom(int range) {
        int n = 0;
        try {
            n = (int)(Math.random() * range) + 1;
        }
        catch (Exception e) {
            System.out.println("Error generating random number");
        }
        return n;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter range: ");
            int range = sc.nextInt();
            GuessingGame obj = new GuessingGame();
            int num = obj.generateRandom(range);
            System.out.print("Guess the number: ");
            int guess = sc.nextInt();
            while (guess != num)
            {
                System.out.println("Wrong guess! Try again:");
                guess = sc.nextInt();
            }
            System.out.println("Correct! Thank you for playing.");
        }
        catch (Exception e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }
    }
}
