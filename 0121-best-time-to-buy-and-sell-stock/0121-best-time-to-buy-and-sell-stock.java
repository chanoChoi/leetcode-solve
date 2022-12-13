class Solution {
    public int maxProfit(int[] prices) {
        int max = prices[prices.length - 1]; // 6
        int res = Integer.MIN_VALUE; // 5
        for (int i = prices.length - 2; i >= 0; i --) {
            res = Math.max(max - prices[i], res); //5
            max = Math.max(max, prices[i]); //  7
        }
        return Math.max(res, 0);
    }
}