package com.dayOne;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String output = "";
        String[] sa = input.split("");

        String numbers = "0123456789";
        for (int i = sa.length; i > 0; i--) {
            if(!numbers.contains(sa[i-1])) {
                output += sa[i - 1];
            }
        }
        System.out.println(output);
    }
}
