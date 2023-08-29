package check;

import java.util.*;

public class AuthenticationTokens {

    public static void main(String[] args) {
        /*int expiryLimit = 4;
        List<Integer> a = new LinkedList<>(Arrays.asList(0,1,1));
        List<Integer> b = new LinkedList<>(Arrays.asList(0,2,2));
        List<Integer> c = new LinkedList<>(Arrays.asList(1,1,5));
        List<Integer> d = new LinkedList<>(Arrays.asList(1,2,7));

        List<List<Integer>> commands = new LinkedList<>();
        commands.add(a);
        commands.add(b);
        commands.add(c);
        commands.add(d);*/

        int expiryLimit = 3;
        List<Integer> a = new LinkedList<>(Arrays.asList(0,1,1));
        List<Integer> b = new LinkedList<>(Arrays.asList(1,1,5));

        List<List<Integer>> commands = new LinkedList<>();
        commands.add(a);
        commands.add(b);

        System.out.println(numberOfTokens(expiryLimit, commands));
    }

    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands){
        Map<Integer, Integer> tokenIdVsTime = new HashMap<>();
        int countOfTokens = 0;

        if(commands == null || commands.isEmpty()) {
            //invalid input
            return 0;
        }

        for(List<Integer> i : commands){
            if(i.size() != 3){
                //invalid input
                return 0;
            }

            if(i.get(0)==0){
                System.out.println("Get Token | Token ID : "+ i.get(1) + " | Token at || "+ Math.addExact(i.get(2),expiryLimit));
                tokenIdVsTime.put(i.get(1), i.get(2)+expiryLimit);
            } else {
                System.out.println("Reset Token | Token ID : "+ i.get(1) + " | Token Reset at || "+ i.get(2));
                if(tokenIdVsTime.containsKey(i.get(1))){
                    int tokenSetTime = tokenIdVsTime.get(i.get(1));
                    int tokenResetTime = i.get(2);
                    if(tokenSetTime + expiryLimit >= tokenResetTime){
                        tokenIdVsTime.put(i.get(1), i.get(2)+expiryLimit);
                    } else{
                        tokenIdVsTime.remove(i.get(1));
                    }
                }
            }
        }
        return countOfTokens;
    }
}
