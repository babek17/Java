public class PowXN {
    public static void main(String[] args) {
        double temp=2;
        System.out.println(myPow(temp, -3));
    }

    public static double myPow(double x, int n) {
        if(n==0) return 1;
        if(n>0){
            if(n%2==1) return 1*x*myPow(x, n-1);
            return 1*myPow(x*x, n/2);
        }
        else{
            if(n%2==-1) return 1/(x*myPow(x,-(n+1)));
            return 1/myPow(x*x, -(n/2));
        }
    }
}
