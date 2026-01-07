import java.util.Arrays;

public class Map
{
    public String[][] baseMatrix = {{"01", "02", "03", "04"},
            {"05", "06", "07", "08"},
            {"09", "10", "11", "12"},
            {"13", "14", "15", "()"}};
    public String[][] currentMatrix = {{"01", "02", "03", "04"},
            {"05", "06", "07", "08"},
            {"09", "10", "11", "12"},
            {"13", "14", "15", "()"}};

    public void SwapObjectsByPosition(int[] firstPosition, int[] secondPosition)
    {
        String firstObj = currentMatrix[firstPosition[0]][firstPosition[1]];
        String secondObj = currentMatrix[secondPosition[0]][secondPosition[1]];

        currentMatrix[firstPosition[0]][firstPosition[1]] = secondObj;
        currentMatrix[secondPosition[0]][secondPosition[1]] = firstObj;
    }

    public void PrintMap()
    {
        for (int line = 0; line < currentMatrix.length; line++)
        {
            for (int column = 0; column < currentMatrix[line].length; column ++)
            {
                System.out.print(currentMatrix[line][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
