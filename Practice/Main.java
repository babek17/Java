
public class Main {
    private int x=3;
    public void printX(){
        System.out.println(x);
    }
}

class B extends Main{
    public int x=2;
    public static void main(String[] args) {
        B test=new B();
        test.printX(); 
        System.out.println(test.x);
    }
}

