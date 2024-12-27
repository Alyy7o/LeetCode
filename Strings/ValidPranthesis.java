import java.util.Stack;

public class ValidPranthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if((stack.empty()) && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            }
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else if((stack.peek() == '(' && s.charAt(i) == ')') || 
                    (stack.peek() == '{' && s.charAt(i) == '}') || 
                    (stack.peek() == '[' && s.charAt(i) == ']')){
                stack.pop();
            }
            else{
                return false;
            }
        }
        
        if(stack.empty()) return true;

        return false;
    }
    public static void main(String[] args) {
        String s = "(})";
        if(isValid(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}
