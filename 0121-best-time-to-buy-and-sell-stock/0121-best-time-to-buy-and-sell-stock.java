class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int sell = Integer.MIN_VALUE;
        for (int p : prices) {
            buy = Math.min(buy, p);
            sell = Math.max(sell, p - buy);
        }
        return sell;
    }
}