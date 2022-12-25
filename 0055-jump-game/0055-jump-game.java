class Solution {
    public boolean canJump(int[] nums) {
        int point = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (point < i) return false;
            point = Math.max(point, i + nums[i]);
            if (point >= nums.length) return true;
        }
        return true;
    }
}