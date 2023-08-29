package value;

import org.testng.annotations.Test;

public class BestTimeTobuyAndSell {

    @Test
    public void bestTimeToBuy() {
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(getMaxProfit(prices));
    }

    public int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length-1; i++) {
            profit = prices[i+1] - prices[i];
            if(profit > 0) {
                maxProfit += profit;
            }
        }
        return maxProfit;
    }
}
