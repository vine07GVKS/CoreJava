package first_ass;

public class democode {
    float numModel =5.3f;
    public static void main(String[] args) {
        char height='H';
        short length=(short) height;
        System.out.println("\n");
        System.out.println("my char value is "+height+ " it's converted on short value is "+ length);

        democode obj=new democode();
        obj.convert();

    }
    public void convert()
    {   System.out.println("\n");
        System.out.println("using local variable");
        int model=85;
        double car = model;
        char model1=(char)model; // narrowing
        System.out.println("my double value is "+car+" it's converted on char value is  "+model1+" _________ the NARROWING method ___________");

        int toyCar = 15; // widening
        long carNumber=toyCar;
        System.out.println("my int value is "+toyCar+" it's converted on long value is "+carNumber+" _________ the WIDENING method ___________\n");

        System.out.println("using global variable "+numModel);
    }

}
