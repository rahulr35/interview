package check;

import java.util.LinkedList;
import java.util.List;

public class Palindrome {


//Find the longest palindrome in given String
//input- hello madam adabada
//output-adabada

    public static void main(String[] args) {
        String input = "hello madddam adabada dadabadad";
        System.out.println(findTheLongestPalindrome(input));
    }

    public static List<String> findTheLongestPalindrome(String input) {
        List<String> longestPal = new LinkedList<>();
        int len = 0;
        String[] inputArray = input.split(" ");
        for (String s : inputArray) {
            String temp = reverseString(s);
            if (temp.equalsIgnoreCase(s) && s.length() >= len) {
                if (longestPal.size() >= 1) {
                    longestPal.add(s);
                } else {
                    longestPal.add(s);
                    len = s.length();
                }
            }
        }
        return longestPal;
    }

    public static String reverseString(String s) {
        char[] chArray = s.toCharArray();
        int n = s.length();
        char temp;
        for (int i = 0; i < n / 2; i++) {
            temp = chArray[i];
            chArray[i] = chArray[chArray.length - 1 - i];
            chArray[chArray.length - 1 - i] = temp;
        }
        String rev = "";
        for (char c : chArray) {
            rev += c;
        }

        return rev;
    }

}
