package value;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.testng.annotations.Test;

import java.util.*;

public class SmallestNegative {

    @Test
    public void getSmallestNegativeBalance() {
        List<DebtRecord> debts = new LinkedList<>();
        debts.add(new DebtRecord("Alexa", "Blake", 2));
        debts.add(new DebtRecord("Blake", "Alexa", 2));
        debts.add(new DebtRecord("Casey", "Alexa", 5));
        debts.add(new DebtRecord("Blake", "Casey", 7));
        debts.add(new DebtRecord("Alexa", "Blake", 4));
        debts.add(new DebtRecord("Alexa", "Casey", 4));
        System.out.println(minimumDebtMembers(debts));
    }

    public static List<String> minimumDebtMembers(List<DebtRecord> records) {
        HashMap<String, Integer> debt = new HashMap<>();    // get balance by name, name -> balance

        for (DebtRecord record : records) {
            debt.put(record.lender, debt.getOrDefault(record.lender, 0) + record.amount);
            debt.put(record.borrower, debt.getOrDefault(record.borrower, 0) - record.amount);
        }

        int min = Collections.min(debt.values());
        List<String> res = new ArrayList<>();
        if (min >= 0) {
            return res;
        }

        for (Map.Entry<String, Integer> entry : debt.entrySet()) {
            if (entry.getValue() == min) {
                res.add(entry.getKey());
            }
        }

        Collections.sort(res);
        return res;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public static class DebtRecord {
        public String borrower;
        public String lender;
        public int amount;
    }
}

