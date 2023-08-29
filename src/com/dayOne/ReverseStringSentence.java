package com.dayOne;

public class ReverseStringSentence {

    public static void main(String args[]) {
        String s = "Ezetap Makes Payments easy";
        String output = "";
        String [] sa = s.split(" ");
        for (int j = 0; j < sa.length ; j++){
            String st = "";
            for (int i = sa[j].length(); i > 0; i--){
                st += String.valueOf(sa[j].charAt(i-1));
            }
            if (j != 0){
                output += " "+st;
            } else {
                output += st;
            }
        }
        System.out.println(output);
    }



}
