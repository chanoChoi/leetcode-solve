class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int prev = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = prev;
            prev = prev * nums[i];
        }
        prev = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] = answer[i] * prev;
            prev = prev * nums[i];
        }
        return answer;
    }
}