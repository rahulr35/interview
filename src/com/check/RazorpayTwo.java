package check;

import java.util.Stack;

public class RazorpayTwo {

    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //An input string is valid if:
    //1. Open brackets must be closed by the same type of brackets.
    //2. Open brackets must be closed in the correct order.

    // Input Str --> char array
    // Stack --> ch
    // for --> open --> close
    public static void main(String [] args){
        String in = "{(})";
        System.out.println("String is " + checkValidString(in));
    }

    public static boolean checkValidString(String input) {
        boolean flag = true;
        Stack<Character> s = new Stack<>();
        char[] ch = input.toCharArray();
        for (Character c : ch) {
            if (c=='(' || c=='{' || c=='[') {
                s.push(c);
            } else {
                if (c==')' && !(s.pop() =='(')) {
                    flag = false;
                    return flag;
                } else if (c=='}' && !(s.pop() ==('{'))) {
                    flag = false;
                    return flag;
                } else if (c==']' && !(s.pop().equals('['))) {
                    flag = false;
                    return flag;
                }
            }
        }
        return flag;
    }
}
