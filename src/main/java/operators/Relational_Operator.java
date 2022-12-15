package operators;

import java.util.Scanner;

public class Relational_Operator {
    public static void main(String[] args) {
        int watch;
        int smart_watch= 9000;
        Scanner Watch =new Scanner(System.in);
        System.out.println("Enter your expected watch amount = ");
        watch=Watch.nextInt();
        System.out.println("Your expected watch amount "+ watch+" your  eligible to by the watch "+(watch<=4000));
        System.out.println(watch>=smart_watch);
    }
}
