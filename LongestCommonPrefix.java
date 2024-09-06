import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[]={"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
       String str="";
       Arrays.sort(strs);
       for(int i=0;i<Math.min(strs[0].length(),strs[strs.length-1].length());i++){
           if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)) return str;
           str+=strs[0].charAt(i);
       }
       return str;
    }
}
