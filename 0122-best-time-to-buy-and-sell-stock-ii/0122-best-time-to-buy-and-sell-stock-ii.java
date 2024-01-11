class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int tmp = Math.max(prices[i + 1] - prices[i], 0);
            sum += tmp;
        }
        return sum;
    }
}