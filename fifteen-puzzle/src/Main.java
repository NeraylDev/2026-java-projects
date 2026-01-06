import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        while (true) {
            String movementDirection = scanner.next();
            game.Move(movementDirection);
            game.PrintPlayerStats();
        }
    }
}