package check;

import java.util.*;

public class Cashfree {

    public static void main(String[] args) {
        // input= [test,tester,testing]
        List<String> input = Arrays.asList("tesser", "test", "teing");
        findTheCommonPrefix(input);

    }

    public static void findTheCommonPrefix(List<String> inputList) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < inputList.size(); i++) {
            map.put(inputList.get(i).length(), inputList.get(i));
        }

        String small = "";
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            small = entry.getValue();
           break;
        }

        String repeatingSqeq = "";
        for(String s : inputList){
            if(s.startsWith(small)){
                repeatingSqeq = small;
                continue;
            } else {
                for(int i = 1; i< small.length(); i++) {
                    small = small.substring(0, small.length() - i);
                    if (s.startsWith(small)) {
                        repeatingSqeq = small;
                        break;
                    }
                }
            }
        }
        System.out.println("Repeated String :"+ repeatingSqeq);
    }
}
