class Solution {
    public void sortColors(int[] nums) {
        int l = 0, m = 0, r = nums.length - 1;
        while (m <= r) {
            if (nums[m] == 0) {
                swap(l, m, nums);
                m = m + 1;
                l = l + 1;
            } else if (nums[m] == 1) {
                m = m + 1;
            } else {
                swap(m, r, nums);
                r = r - 1;
            }
        }
    }
    
    private void swap(int idx1, int idx2, int[] nums) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
}