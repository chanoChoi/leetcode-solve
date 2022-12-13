class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int tmp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = tmp;
                idx++;
            }
        }
    }
}