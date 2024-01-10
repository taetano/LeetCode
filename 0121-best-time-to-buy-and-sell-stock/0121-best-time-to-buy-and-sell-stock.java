class Solution {
    public int maxProfit(int[] prices) {
        int sell = prices[prices.length - 1];
        int max = 0;
        for (int i = prices.length - 2; i >= 0; i--) {
            max = Math.max(max, sell - prices[i]);
            sell = Math.max(sell, prices[i]);
        }
        
        return max;
    }
}