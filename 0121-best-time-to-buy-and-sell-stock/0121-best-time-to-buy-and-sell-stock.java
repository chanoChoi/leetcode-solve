class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int answer = 0;
        for (int i = 1; i < prices.length; i++) {
            answer = Math.max(answer, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return answer;
    }
}