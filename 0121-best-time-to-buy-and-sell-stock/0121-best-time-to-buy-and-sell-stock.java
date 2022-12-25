class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                sum = Math.max(sum, prices[i] - min);
            }
        }
        return sum;
    }
}