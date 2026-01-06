public class Game
{

    public String[][] matrix = {{"01", "02", "03", "04"},
            {"05", "06", "07", "08"},
            {"09", "10", "11", "12"},
            {"13", "14", "15", "()"}};

    public int[] playerPosition = {3, 3}; // [x, y]

    public void PrintPlayerStats() {
        System.out.println("Player Position: (" + playerPosition[1] + ", " + playerPosition[0] + ")\n");
    }

    public void UpdatePlayerObjectPosition(int[] oldPosition, int[] newPosition)
    {
        String other = matrix[newPosition[0]][newPosition[1]];
        matrix[newPosition[0]][newPosition[1]] = "()";
        matrix[oldPosition[0]][oldPosition[1]] = other;

        PrintMatrix();
    }

    public void PrintMatrix()
    {
        for (int line = 0; line < matrix.length; line++)
        {
            for (int column = 0; column < matrix[line].length; column ++)
            {
                System.out.print(matrix[line][column] + " ");
            }
            System.out.println();
        }
    }

    public void Move(String directionInput) {
        int[] oldPosition = new int[]{playerPosition[0], playerPosition[1]};

        switch (directionInput) {
            case "W":
                MoveUp();
                break;
            case "S":
                MoveDown();
                break;
            case "A":
                MoveLeft();
                break;
            case "D":
                MoveRight();
                break;
        }

        int[] newPosition = new int[]{playerPosition[0], playerPosition[1]};
        UpdatePlayerObjectPosition(oldPosition, newPosition);
    }

    private void MoveUp() {
        playerPosition[0] -= 1;
        if (playerPosition[0] < 0)
            playerPosition[0] = 0;
    }

    private void MoveDown() {
        playerPosition[0] += 1;
        if (playerPosition[0] > 3)
            playerPosition[0] = 3;
    }

    private void MoveLeft() {
        playerPosition[1] -= 1;
        if (playerPosition[1] < 0)
            playerPosition[1] = 0;
    }

    private void MoveRight() {
        playerPosition[1] += 1;
        if (playerPosition[1] > 3)
            playerPosition[1] = 3;
    }

}
