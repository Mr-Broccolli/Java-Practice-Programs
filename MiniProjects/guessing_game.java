package MiniProjects;

import java.util.Scanner;

class GuessingGame
{
    public int generateRandom(int range)
    {
        int n = (int)(Math.random() * range) + 1;
        return n;
    }

    public static void main()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter range: ");
        int range = sc.nextInt();

        GuessingGame obj = new GuessingGame();
        int num = obj.generateRandom(range);

        System.out.print("Guess the number: ");
        int guess = sc.nextInt();

        while (guess != num)
        {
            System.out.println("Wrong guess, try again:");
            guess = sc.nextInt();
        }

        System.out.println("Correct! Thank you for playing.");
    }
}
