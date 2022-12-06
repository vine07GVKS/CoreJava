package TYPECASTING;

public class DemoTypeCasting
{
    public static void main(String[] args)
    {
        System.out.println("welcome to typecastion process");

        int feet=6;
        System.out.println("my feet is"+feet);
        float inches=feet;//widening
        System.out.println("my inches is"+inches);
        Long weight=(long)inches;//narrowing
        System.out.println("my weight is"+weight);

        char myspace='B';
        short changes=(short) myspace;
        System.out.println(changes+"my charcter value is converted"+myspace);


        int spacevalue=97;
        char convert=(char) spacevalue;
        System.out.println(spacevalue+"my space asci number value for "+convert);

    }
}
