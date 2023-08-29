package check;

import java.util.*;

public class LenderBorrower {

    public static void main(String[] args) {
        List<String> check = new LinkedList<>(Arrays.asList("Alexa", "Blake", "2"));
        List<String> check1 = new LinkedList<>(Arrays.asList("Blake", "Alexa", "2"));
        List<String> check2 = new LinkedList<>(Arrays.asList("Casey", "Alexa", "5"));
        List<String> check3 = new LinkedList<>(Arrays.asList("Blake", "Casey", "7"));
        List<String> check4 = new LinkedList<>(Arrays.asList("Alexa", "Blake", "4"));
        List<String> check5 = new LinkedList<>(Arrays.asList("Alexa", "Casey", "4"));

        List<List> debts = new LinkedList<>();
        debts.add(check);
        debts.add(check1);
        debts.add(check2);
        debts.add(check3);
        debts.add(check4);
        debts.add(check5);

        System.out.println(findTheSmallestNegativeBalance(debts));
    }

    public static List<String> findTheSmallestNegativeBalance(List<List> debts) {
        List<String> minimumBalanceList = new LinkedList<>();
        Map<String, Integer> balancesMap = new HashMap<>();

        for (List<String> list : debts) {
            if (!list.isEmpty() || list.size() == 3) {
                String lender = list.get(1);
                String borrower = list.get(0);
                Integer amount = Integer.valueOf(list.get(2));

                balancesMap.put(lender, balancesMap.getOrDefault(lender, 0) + amount);
                balancesMap.put(borrower, balancesMap.getOrDefault(borrower, 0) - amount);
            }
        }

        Integer check = Collections.min(balancesMap.values());
        if(check >= 0){
            minimumBalanceList.add("Nobody has a negative balance");
            return minimumBalanceList;
        }

        for (Map.Entry<String, Integer> entry : balancesMap.entrySet()) {
            if (entry.getValue() == check) {
                minimumBalanceList.add(entry.getKey());
            }
        }

        Collections.sort(minimumBalanceList);
        return minimumBalanceList;
    }


}
