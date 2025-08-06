// Last updated: 8/6/2025, 11:04:34 AM
class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0], profit = 0;
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            } else if(prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}