package com.dayOne;

import java.util.LinkedHashSet;
import java.util.Set;

public class GeneratePermutations {

    public static void main (String args []){
        String combo = "abba";
        permutation(combo, "");
        System.out.println(permutationSet);
    }

    static Set<String> permutationSet = new LinkedHashSet<>();
    public static void permutation(String str, String combo){
        if (str.length()==0){
            permutationSet.add(combo);
            return;
        }

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);
            permutation(ros, c+combo);
        }
    }

}
