package Array_Concept;

public class multipledimension_array
{
    public static void main(String[] args)
    {
                int[][] numbers={{10,22,32,44},{24,85,46,20},{07,88,39,54}};

        for(int row=0;row<3;row++)
        {
            for(int column=0;column<4;column++)
            {
                System.out.print(numbers[row][column]+" ");
            }
            System.out.println();
        }
    }
}
