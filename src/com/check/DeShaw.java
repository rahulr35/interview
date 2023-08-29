package check;

import java.util.*;

public class DeShaw {

    //length of longest non repeating substring
    public static void main(String[] args) {
        String in = "rahulrajan";
        char[] charArray = in.toCharArray();
        Map<String, Integer> output = new HashMap<>();
        String o = "";
        for(int i = 0; i < charArray.length; i++) {
            o = "";
            for(int j = i; j < charArray.length; j++) {
                if (!o.contains(String.valueOf(charArray[j]))) {
                    o += charArray[j];
                } else {
                    output.put(o, o.length());
                }
            }

        }
        System.out.println(output);
        System.out.println("Longest Substring length " + output.values().stream().max(Comparator.naturalOrder()).get());
    }
}


// 1. Multiple substrings with same length -
// 2. abcabcbb, bbbbbb -- Working
//