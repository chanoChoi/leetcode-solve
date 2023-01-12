class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        for (int i = 1, tmp = nums[0]; i < nums.length; i++) {
            tmp = Math.max(nums[i], nums[i] + tmp);
            sum = Math.max(sum, tmp);
        }
        return sum;
    }
}