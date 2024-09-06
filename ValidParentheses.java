
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str="]";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='['||c=='{') st.push(c);
            else{
                if(st.isEmpty()) return false;

                if((c==')'&&st.peek()=='('||(c==']'&&st.peek()=='['||(c=='}'&&st.peek()=='{')))) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
