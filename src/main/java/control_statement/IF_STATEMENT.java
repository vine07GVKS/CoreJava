package control_statement;

import java.util.Scanner;

public class IF_STATEMENT
{
    public static void main(String[] args)

    {
        System.out.println("enter the no.of note for u ");
        int note=0;
        Scanner school=new Scanner(System.in);
        note=school.nextInt();

        System.out.println("enter the no.of books for u ");
        int book = 0;
        book=school.nextInt();

        if(note>=book)
        {
            System.out.println("if note is greater than or equal to book ");

        }
        else if(book<=note)
        {
            System.out.println("if note is less than or equal to book");
        }
        else
        {
            System.out.println("not correct statement");
        }

    }
}
