public class Player
{
    public int[] playerPosition = {3, 3}; // [y, x]

    public void PrintPlayerInfo() {
        System.out.println("=-=-= Player Info =-=-=");
        System.out.println("Player Position: (" + playerPosition[1] + ", " + playerPosition[0] + ")\n");
    }

    public void Move(Map map, String directionInput) {
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

        map.SwapObjectsByPosition(oldPosition, newPosition);
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
