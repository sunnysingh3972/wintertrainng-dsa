
import java.util.Stack;

public class validParenthesis {
    public static boolean isValid(String s) {
        Stack<Character> S = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                S.push(s.charAt(i));
            } else {
                if (!S.isEmpty()) {
                    if (S.peek() == '(' && s.charAt(i) == ')' || S.peek() == '{' && s.charAt(i) == '}'
                            || S.peek() == '[' && s.charAt(i) == ']')
                        S.pop();
                    
                    else {
                        return false;
                    }
                }
                    else 
                    return false;

                

            }

        }
        if (!S.isEmpty())
            return false;

        return true;
    }

    public static void main(String[] args) {
        String s = "())";
        System.out.println(isValid(s));

    }
}
