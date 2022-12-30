package assignment;
public class sec_ass
{
   static int shop=10;
    public static void main(String[] args)
    {
        float myStore=shop;
        System.out.println("using the wedding method method  "+ myStore+ "  working on the double to float");

        No_Of_fruit();
    }
    public static void No_Of_fruit()
    {

        double costums=10;                       // using the local variable
        float files= (float) costums;
        System.out.println("using the narrowing method "+ files+" working on the double to float ");
    }
}
