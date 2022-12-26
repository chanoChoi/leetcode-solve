class Solution {
    public void sortColors(int[] nums) {
        int l = 0, m = 0, r = nums.length - 1;
        while (m <= r) {
            if (nums[m] == 0) {
                swap(nums, l, m);
                l = l + 1;
                m = m + 1;
            } else if (nums[m] == 1) {
                m = m + 1;
            } else if (nums[m] == 2) {
                swap(nums, m, r);
                r = r - 1;
            }
        }
    }
    
    private void swap(int[] nums, int idx1, int idx2) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
}