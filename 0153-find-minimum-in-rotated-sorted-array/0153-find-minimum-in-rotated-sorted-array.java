class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        if (len == 2) return Math.min(nums[0], nums[1]);
        if (nums[0] < nums[len - 1]) return nums[0];
        int l = 0, r = len - 1;
        int answer = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > nums[m + 1]) {
                answer = nums[m + 1];
                break;
            }
            if (nums[l] <= nums[m]) l = m + 1;
            else if (nums[r] >= nums[m]) r = m - 1;
        }
        return answer;
    }
}