
public class Main {

    public static void run(double d){
        System.out.println("double version: "+d);
    }
    public static void run(int i) { System.out.println("Int version: " + i);
    }
    public static void run(byte b) { System.out.println("Byte version: " + b);
    }

    public static void main(String[] args){
        byte a=5;
        short b=10;
        int c =15;
        float d = 20.1f;
        double e = 25.23;
        Main.run(a);
        Main.run(b);
        Main.run(c);
        Main.run(d);
        Main.run(e);
    }
}

