package Array_Concept;

public class Array_con
{
    public static void main(String[] args)
    {
        double salary[]={2.3,4.6,5.6,45.6};
        String [] chocolatename={"Kitkat","Diary","MilkyBar","Nesty","FiveStar","Drzl"};
        System.out.println(chocolatename[4]);
        System.out.println(chocolatename.length);
        for(int index=0;index< chocolatename.length;index++)//for loop
        {
            System.out.print(chocolatename[index]+",");
        }

       //  System.out.println(Arrays.toString(chocolatename));//tostring method

        for(String choco:chocolatename)
        {
            System.out.print(choco+" ");
        }

    }
}
