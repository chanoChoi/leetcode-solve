class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1, cnt = 0, left = 0, right = 0;
        while (right < nums.length) {
            prod *= nums[right];
            while (left <= right && prod >= k) {
                prod /= nums[left];
                left++;
            }
            cnt += right - left + 1;
            right++;
        }
        return cnt;
    }
}