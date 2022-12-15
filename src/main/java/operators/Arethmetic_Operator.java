package operators;
import java.util.Scanner;
public class Arethmetic_Operator {
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);//object creation
        int  Wallet=0;
        int I_spentAmount=0;
        System.out.println("Enter the total spend amount in your wallet = ");
        Wallet=obj.nextInt();
        System.out.println("Now My balance is "+Wallet);
        I_spentAmount=obj.nextInt();
       int myWallet=Wallet-I_spentAmount;//SUBTRACTION
        System.out.println("Your balance amount is "+myWallet);
        String after_Wallet="before i spend amount in wallet "+Wallet+ " after i spend remaining amount in Wallet "+myWallet;
        System.out.println(after_Wallet);




    }
}
