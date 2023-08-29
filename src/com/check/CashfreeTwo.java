package check;

import java.util.*;

public class CashfreeTwo {

    public static void main(String[] args) {
        // Input -- Kozikode
        List<String> inputList = Arrays.asList("Kozikode", "Mumbai", "aa", "p", "", null);
        for(String s : inputList){
            findTheNonRepeatingChar(s);
        }

    }

    public static void findTheNonRepeatingChar(String input){
        String [] list = input.toLowerCase().split("");
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String s : list){
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            } else {
                map.put(s,1);
            }
        }

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if (entry.getValue()==1){
                System.out.println("1st Non repeating character : "+ entry.getKey());
                break;
            }
        }
    }




}
