package com.dayOne;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld {

    public static void main (String [] args){
        System.out.println("Hello World");
        getCount("adda");

    }

    public static void getCount(String word){
        String [] a = word.split("");
        Map<String, Integer> m = new HashMap<>();
        for(int i = 0 ; i < a.length; i++){
            if (m.containsKey(a[i])){
                m.put(a[i], m.get(a[i])+1);
            } else {
                m.put(a[i], 1);
            }
        }
        System.out.println(m);
     }
}
