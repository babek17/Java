import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {
        int count=0;
        HashMap<Character, Integer> roman=new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1&&roman.get(s.charAt(i))<roman.get(s.charAt(i+1))) count-=roman.get(s.charAt(i));
            else count+=roman.get(s.charAt(i));
        }
        return count;
    }
}
