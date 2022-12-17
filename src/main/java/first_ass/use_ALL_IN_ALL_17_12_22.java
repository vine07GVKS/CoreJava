package first_ass;

import java.util.Scanner;

public class use_ALL_IN_ALL_17_12_22
{
    static{
        System.out.println("WELCOME TO RENTAL AND PERSONAL USE HOUSE SELECTION CENTER ");
    }
    public static void main(String[] args)
    {
       do {
           System.out.println("In which type house you want ? \n RENTAL  \n PERSONAL  ");
           Scanner house = new Scanner(System.in);
           String HOME =house.next();

           switch (HOME)
           {
               case "RENTAL":
               {
                   System.out.println("You choose the rental house selection ");
                   System.out.println(" Ground_Floor \n  First_Floor \n Second_Floor");
                   System.out.println("you select the which type house ");
                   String HOUSE =house.next();

                   switch (HOUSE)
                   {
                       case "Ground_Floor":
                           System.out.println("Normal \nTraditional \nNEW_MODEL");
                           System.out.println("Enter your which type you need a house ");
                           String typehome=house.next();
                           switch (typehome)
                           {
                               case "Normal":
                                   System.out.println("Normal house rent is 15,000 per mounth  and advance 40,000 ");
                                   System.out.println("IN this home are you interested YES or NO ");
                                   String desition1 = house.next();
                                   switch (desition1)
                                   {
                                       case "YES ":
                                           System.out.println("OK next step to pay the amount advance 40,000 \n then end of the first month you pay the 15,000 for house rent ");
                                           break;
                                       case "NO":
                                           System.out.println("ok, THANK FOR YOU VISITING THE PLACE ");
                                           break;
                                   }
                                   break;
                               case "Traditional":
                                   System.out.println("Traditional house rent is 25,000 per month  and advance 50,000 ");
                                   System.out.println("IN this home are you interested YES or NO ");
                                   String desition2 = house.next();
                                   switch (desition2)
                                   {
                                       case "YES":
                                           System.out.println("OK next step to pay the amount advance 50,000 \n then end of the first month you pay the 25,000 for house rent ");
                                           break;
                                       case "NO":
                                           System.out.println("ok, THANK YOU FOR VISITING THE PLACE ");
                                           break;
                                   }
                                   break;

                               case "NEW_MODEL":
                                   System.out.println("NEW_MODEL house rent is 35,000 per month  and advance 70,000 ");
                                   System.out.println("IN this home are you interested YES or NO ");
                                   String desition3 = house.next();
                                   switch (desition3)
                                   {
                                       case "YES":
                                           System.out.println("OK next step to pay the amount advance 70,000 \n then end of the first month you pay the 35,000 for house rent ");
                                           break;
                                       case "NO":
                                           System.out.println("ok, THANK YOU FOR VISITING THE PLACE ");
                                           break;
                                   }
                                   break;
                           }

                   }
               }
               break;

               case "PERSONAL":
               {
                   System.out.println("You choose the personal house selection ");
                   System.out.println("Ground_Floor \nFirst_Floor \nSecond_Floor");
                   System.out.println("you select the which type house ");
                   String HOUSE =house.next();

                   switch (HOUSE)
                   {
                       case "Ground_Floor":
                           System.out.println("Normal \nTraditional\nNEW_MODEL");
                           System.out.println("Enter your which type you need a house ");
                           String typehome=house.next();

                           switch (typehome)
                           {
                               case "Normal":
                                   System.out.println("This type of normal home total amount is 25,00,000 ");
                                   System.out.println("IN this home are you interested to by \n YES or NO ");
                                   String desition1 = house.next();
                                   switch (desition1)
                                   {
                                       case "YES":
                                           System.out.println("OK next step to pay the amount  25,00,000 \n THANK YOU 🤝 ");
                                           break;
                                       case "NO":
                                           System.out.println("ok, THANK YOU FOR VISITING THE PLACE ");
                                           break;
                                   }
                                   break;

                               case "Traditional":
                                   System.out.println("This type of Traditional home total amount is 45,00,000 ");
                                   System.out.println("IN this home are you interested \n YES or NO ");
                                   String desition2 = house.next();
                                   switch (desition2)
                                   {
                                       case "YES":
                                           System.out.println("OK next step to pay the amount  45,00,000 \n THANK YOU 🤝 ");
                                           break;
                                       case "NO":
                                           System.out.println("ok, THANK YOU FOR VISITING THE PLACE ");
                                           break;
                                   }
                                   break;

                                   case "NEW_MODEL":
                                   System.out.println("This type of NEW_MODEL home total amount is 60,00,000 ");
                                   System.out.println("IN this home are you interested \n YES or NO ");
                                   String desition3 = house.next();
                                   switch (desition3)
                                   {
                                       case "YES":
                                           System.out.println("OK next step to pay the amount  60,00,000 \n THANK YOU 🤝 ");
                                           break;
                                       case "NO":
                                           System.out.println("ok, THANK YOU FOR VISITING THE PLACE ");
                                           break;
                                   }
                                   break;
                           }

                   }
               } break;
           }

       }while (true);

    }
}


