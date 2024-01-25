class Solution {
    public int maxProfit(int[] prices) {
        int sellTo = 0;
        int ans = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            ans = Math.max(ans, sellTo - prices[i]);
            sellTo = Math.max(sellTo, prices[i]);
        }
        
        return ans;
    }
}