class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0, j = 1; i < nums.length; i++) {
            ans[i] = j;
            j = nums[i] * j;
        }
        for (int i = nums.length - 1, j = 1; i >= 0; i--) {
            ans[i] = ans[i] * j;
            j = nums[i] * j;
        }
        
        return ans;
    }
}