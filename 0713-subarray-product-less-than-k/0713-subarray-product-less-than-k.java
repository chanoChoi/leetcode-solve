class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int product = 1;
        int len = 0;
        while (right < nums.length) {
            product *= nums[right];
            while (left <= right && product >= k) {
                product /= nums[left];
                left++;
            } 
            len += right - left + 1;
            right++;
        }
        return len;
    }
}