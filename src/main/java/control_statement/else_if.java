package control_statement;
import java.util.Scanner;

public class else_if {
    public static void main(String[] args)
    {
       do {
           Scanner cakes= new Scanner (System.in);
           int need_no_of_cakes=0;
           int no_Of_Cakes_Avaliable =0;
           System.out.println("How many cakes u want = ");
           int nocakes=cakes.nextInt();
           System.out.println("total available = ");
           int total_available=cakes.nextInt();
           if ( nocakes<=total_available)
           {
               System.out.println("yes, i will take it your order and please wait");
           }
           else
           {
               System.out.println("sorry, only we have less no fo cakes \n Thank You \t wist next time ");
           }
       }while (true);
    }
}
