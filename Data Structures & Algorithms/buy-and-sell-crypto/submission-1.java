class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int n = prices.length;
        int l = 0;
        int r = 1;

        while( r < n) {
            if(prices[l] < prices[r]) {
                int p = prices[r] - prices[l];
                profit = Math.max(p, profit);
            }else {
                l = r;
            }
            r++;
        }
        return profit;
    }
}
