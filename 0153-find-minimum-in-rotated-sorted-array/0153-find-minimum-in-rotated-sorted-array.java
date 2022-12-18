class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        if (nums[0] < nums[nums.length - 1]) return nums[0];
        
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m + 1 < nums.length && nums[m] > nums[m + 1]) return nums[m + 1];
            else if (m - 1 >= 0 && nums[m] < nums[m - 1]) return nums[m];
            
            if (nums[l] <= nums[m]) l = m + 1;
            else if (nums[r] >= nums[m]) r = m - 1;
        }
        return nums[l];
    }
}