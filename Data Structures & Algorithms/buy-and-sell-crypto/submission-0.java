class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        for(int i= 0; i < n; i++) {
            int bP = prices[i];
            for(int j = i; j < n; j++) {
                profit = Math.max(prices[j] - bP, profit);
            }
        }
        return profit;
    }
}
