package assignment.mulitidimensionarray_third_ass;
import java.sql.Array;
import java.util.Arrays;
public class multi2
{
    public int [][] array={ {55,65,75},{15,25,35},{45,85,95} };

    public void numpy()
    {
        int [] array1 = new int [array.length * array.length];

        int row=2,col=0,update=0;
        for(;col< array.length;col++,update++)
        {
            array1[update]=array[row][col];
        }                                               // col=3,row=2,update=3

        row--;col--;
        for(;row>=0  ;row--,update++)
        {
            array1[update]=array[row][col];
        }
        row++;col--;
        for(;col>=0;col--,update++)
        {
            array1[update]=array[row][col];
        }
        row++;col++;
        for(;row<=1;row++,update++)
        {
            array1[update]=array[row][col];
        }
        row--;col++;
        for(;col<=1;col++,update++)
        {
            array1[update]=array[row][col];
        }

            System.out.println(Arrays.toString(array1));

        System.out.println(array1.length);
        for(int value= array1.length-1;value>=0;value--)
        {
            System.out.print(array1[value]+" ");
        }

    }


    public static void main(String[] args)
    {
        multi2 few =new multi2();
        few.numpy();
    }
}


