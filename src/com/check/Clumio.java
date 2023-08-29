package check;

import java.util.Stack;

public class Clumio {

    public static void main(String[] args) {
        String word = "abbcccb";
        int k = 3;
        System.out.println(compressWord(word, k));
    }

    public static String compressWord(String word, int k){
        Stack<Character> stack = new Stack<>();
        Integer count = 0;
        String result = "";
        Character repeatingChar = null;

        // Iterating each character in the string
        for(Character character : word.toCharArray()){
            // Checking
            // 1) if the stack is not empty &
            // 2) Last character in stack is equal to current iteration character
            // Then, increase the count by 1
            // Else add the character (current iteration character) to the stack
            // for comparing with next character
            if(!stack.empty() && character == stack.peek() ){
                count++;
            } else {
                stack.push(character);
                count = 0;
            }


            // Here count is starting from 0,
            // When 3 characters to match, count will be 2
            // Hence adding 1 to the result
            if(count+1==k){
                repeatingChar = stack.peek();
                break;
            }
        }

        // Removing the repeating character from the original string
        for(Character c : word.toCharArray()){
            if(c.equals(repeatingChar)){
                continue;
            } else{
                result+=c;
            }
        }

        // Condition for recursion
        return (result.length() < k) ? result : compressWord(result,k);
    }
}
