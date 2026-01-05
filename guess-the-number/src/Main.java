import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerAnswer = -1;
        int playerAttempts = 0;
        int randomNumber = (int)(Math.random() * 100);

        System.out.println("=-=-= Guess the Number =-=-=");
        System.out.println("Guess the randomly chosen number to win!\n");

        while (playerAnswer != randomNumber)
        {
            System.out.print("Type a number: ");
            playerAnswer = scanner.nextInt();

            if (playerAnswer != randomNumber)
            {
                if (playerAnswer > 0 && playerAnswer <= 100)
                {
                    String differenceMessage = "The typed number is ";
                    differenceMessage += (playerAnswer > randomNumber ? "GREATER" : "LESS") + " than the chosen number.";

                    playerAttempts++;
                    System.out.println(differenceMessage + "\n");
                }
                else
                {
                    System.out.println("The typed number is INVALID.\n");
                }
            }
        }

        System.out.println("\nCongratulations! You got it. The chosen number is: " + randomNumber);
        System.out.println("Number of Attempts: " + playerAttempts);
    }
}