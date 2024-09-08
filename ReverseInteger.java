public class ReverseInteger {
   public static void main(String[] args) {
        int x=1534236469;
        System.out.println(reverse(x));
   }
   
   public static int reverse(int x) {
        int len=0,ans=0;
        int temp=Math.abs(x),y=Math.abs(x);
        while(temp>0){
            temp/=10;
            len++;
        }
        try {
            for(int i=0;i<len;i++){
                double t=(y%10)*Math.pow(10,len-1-i);
                ans=Math.addExact(ans,(int) t);
                y/=10;
            }
            return x>0?ans:-ans;
        } catch (ArithmeticException e) {
            return 0;
        }
   }
}
