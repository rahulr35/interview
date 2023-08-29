package check;

import java.util.HashMap;
import java.util.Stack;

public class BalancedString {

    public static boolean isBalanced(String string) {
        HashMap<Character, Character> bracketMap = new HashMap<>();
        bracketMap.put('(', ')');
        bracketMap.put('[', ']');
        bracketMap.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for(int count = 0; count < string.length(); count++) {
            char current = string.charAt(count);
            if(bracketMap.keySet().contains(current)) {
                stack.push(current);
            } else if(bracketMap.values().contains(current)) {
                if(!stack.empty() && bracketMap.get(stack.peek()) == current){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{}()"));
        System.out.println(isBalanced("{(})"));
    }

}
