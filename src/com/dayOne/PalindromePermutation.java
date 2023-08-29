package com.dayOne;

import java.lang.reflect.Array;
import java.util.*;

public class PalindromePermutation {
    // Write a function that takes two integers N & K returns a palindrome of lenght N which consists of K distinct lower case letter
    // Ex. N = 5, K = 2; Return "abbba";
    // Ex. N = 8, K = 3; Return "ppsccspp";'
    // Ex. N = 3, K = 2; Return "opo";
    public static void main(String args[]) {
        palindromeVerify(8, 3);
    }

    // Generate accepted string
    // Get permutation & combination of String as set
    // Verify palindrome for the set
    public static void palindromeVerify(int N, int K) {
        String generatedString = generateString(N, K);
        generatePermutation(generatedString, "");
        System.out.println("Set of String generated through permutation = " + permuSet);
        verifyPalindrome();
    }

    public static String generateString(int N, int K) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String repeatCharacter = "psc";//alpha.substring(0, K);
        System.out.println("Choosen characters off length " + K + " = " + repeatCharacter);
        String[] rc = repeatCharacter.split("");
        List<String> rce = new ArrayList<String>(Arrays.asList(rc));
        rce.add(rc[0]);
        String outPut = "";
        while (outPut.length() < N) {
            if (N % 2 != 0) {
                for (String s : rc) {
                    if (outPut.length() < N) {
                        outPut += s;
                    }
                }
            } else {
                for (String t : rce) {
                    if (outPut.length() < N) {
                        outPut += t;
                    }
                }
            }
        }
        System.out.println("Generated String = " + outPut);
        return outPut;
    }

    static Set<String> permuSet = new LinkedHashSet<>();

    public static void generatePermutation(String inputString, String outPut) {
        if (inputString.length() == 0) {
            permuSet.add(outPut);
            return;
        }

        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            String result = inputString.substring(0, i) + inputString.substring(i + 1);
            generatePermutation(result, c + outPut);
        }
    }

    public static void verifyPalindrome() {
        for (String s : permuSet) {
            StringBuffer sb = new StringBuffer();
            sb.append(s);
            sb.reverse();
            if (sb.toString().equals(s)) {
                System.out.println(sb + " is a palindrome");
                break;
            }
        }
    }
}
