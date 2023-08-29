package check;

import java.util.LinkedList;
import java.util.List;

public class RevereStringPyramid {

    public static void main(String[] args) {
        /*Create a program that reverses print the pyramid after removing all non-alphabetic characters
            Example 1: I/P: Tit4Tat O/P:
            t
            ta
            taT
            taTt
            taTti
            taTtiT

            Example 2: I/P: By4Now8#
            w
            wo
            woN
            woNy
            woNyB
        */
        String input = "Tit4Tat";
        String result = "";
        List<Character> alphabetList = new LinkedList<>();
        for(char c = 'a'; c <= 'z'; c++){
            alphabetList.add(c);
        }

        for(char c = 'A'; c <= 'Z'; c++){
            alphabetList.add(c);
        }

        for(int i = input.length()-1; i >= 0; i--){
            if(alphabetList.contains(input.charAt(i))){
                result += input.charAt(i);
                System.out.println(result);
            }
        }
    }
}
