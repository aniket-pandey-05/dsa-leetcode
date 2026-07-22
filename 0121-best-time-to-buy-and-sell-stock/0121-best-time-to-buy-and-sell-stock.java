class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i = 0 ; i<prices.length ; i++){
            buy = Math.min(buy,prices[i]);
            sell = prices[i];
            profit = Math.max(profit,sell-buy);
        }
        return profit;
    }
}