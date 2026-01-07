import java.util.Arrays;
import java.util.Scanner;

public class Game
{
    private final Scanner _scanner;
    private final Map _map;
    private final Player _player;

    private boolean _started = false;

    public Game()
    {
        _scanner = new Scanner(System.in);
        _map = new Map();
        _player = new Player();
    }

    public void Start()
    {
        RandomizePlayerPosition();
        _map.PrintMap();

        _started = true;
    }

    public void Update()
    {
        if (!_started)
            return;

        String movementDirection = _scanner.next();

        _player.Move(_map, movementDirection);
        _player.PrintPlayerInfo();
        _map.PrintMap();

        if (Arrays.deepEquals(_map.currentMatrix, _map.baseMatrix))
            System.out.println("CONGRATULATIONS! You win!");
    }

    private void RandomizePlayerPosition()
    {
        int numberOfMoves = 10;
        int currentNumberOfMoves = 0;

        while(currentNumberOfMoves < numberOfMoves)
        {
            int direction = (int)(Math.random() * 3);

            switch (direction) {
                case 0:
                    _player.Move(_map, "W");
                    break;
                case 1:
                    _player.Move(_map, "S");
                    break;
                case 2:
                    _player.Move(_map, "A");
                    break;
                case 3:
                    _player.Move(_map, "D");
                    break;
            }

            currentNumberOfMoves++;
        }
    }
}
