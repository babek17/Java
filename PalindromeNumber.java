public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x<0)return false;
        String str=String.valueOf(x);
        for(int i=0, j=str.length()-1;i<j&&j>0;i++, j--){
            if(str.charAt(i)!=str.charAt(j))return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int x=10;
        System.out.println(isPalindrome(x));
    }
}
