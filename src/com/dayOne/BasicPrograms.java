package com.dayOne;

import java.util.LinkedHashMap;
import java.util.Map;

public class BasicPrograms {

    public static void main (String args[]){
        factorial(6);
        factorialRecursive(6);
        addNnaturalNumber(6);
        fibonacci(6);
        primeNumber(16);
        characterCount("Assam");
        reverseString("Massa");
        System.out.println(palindrome("Malayalam"));
    }

    public static int factorial (int n ){
        int sum = 1;
        for (int i = 1; i < n; i++){
            sum += i*sum;
        }
        System.out.println(sum);
        return sum;
    }

    public static int factorialRecursive(int N){
        int sum = 1;
        if (N > 0){
            sum = N * factorialRecursive(N-1);  // 5 * 4 * 3 * 2 * 1
        }
        return sum;
    }

    public static int addNnaturalNumber(int N){
        int sum = 0;
        if (N > 0){
            sum += N + addNnaturalNumber(N-1);  // 5 * 4 * 3 * 2 * 1
        }
        return sum;
    }

    public static void fibonacci (int n ){
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for(int i = 2; i < n ; i++){
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3+" ");
        }
        System.out.println("");
    }

    public static void primeNumber(int n){
        boolean flag = true;
        for (int i = 2; i < n/2; i++){
            if (n%i == 0){
                flag = false;
                break;
            }
        }
        System.out.println(flag);
    }

    public static void characterCount (String s){
        String [] st = s.toLowerCase().split("");
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (String str : st){
            if (countMap.containsKey(str)){
                countMap.put(str, countMap.get(str)+1);
            } else {
                countMap.put(str, 1);
            }
        }
        System.out.println(countMap);
    }

    public static String reverseString(String s){
        String outPut = "";
        String [] st = s.split("");
        System.out.println(st.length);
        for(int i = st.length; i > 0; i--) {
            outPut += st[i-1];
        }
        System.out.println(outPut);
        return outPut;
    }

    public static boolean palindrome(String s){
        String rs = reverseString(s);
        if (rs.equalsIgnoreCase(s)){
            return true;
        } else {
            return false;
        }
    }
}
