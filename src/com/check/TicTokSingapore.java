package check;

import java.util.*;

public class TicTokSingapore {

    public static void main(String[] args) {
        //String s = "1326#";
        String s = "10#11#12";//jkab

        String output = "";
        Map<String, String> map = generateMap();
        String [] str = s.split("");
        for(int i = s.length()-1; i >= 0; i--){
            if(str[i].equals("#")){
                output += map.get(str[i-2]+str[i-1]+str[i]);
                i = i-2;
            } else {
                output += map.get(str[i]);
            }
        }
        System.out.println("Input : "+ s);
        System.out.println("Output : " + reverse(output));

    }

    public static Map generateMap(){
        Map<String, String> map = new LinkedHashMap<>();
        int i = 1;
        for(char c = 'a'; c <= 'z'; c++){
            if(c <= 'i') {
                map.put(String.valueOf(i), String.valueOf(c));
            } else {
                map.put(i+"#", String.valueOf(c));
            }
            i++;
        }
        return map;
    }

    public static String reverse(String orig) {
        char[] s = orig.toCharArray();
        int n = s.length;
        for (int i = 0; i < n/2; i++) {
            char temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
        return new String(s);
    }


}
