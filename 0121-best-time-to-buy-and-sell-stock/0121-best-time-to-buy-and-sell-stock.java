class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int answer = 0;
        for (int num : prices) {
            min = Math.min(num, min);
            answer = Math.max(num - min, answer);
        }
        return answer;
    }
}