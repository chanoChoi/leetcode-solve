class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.min(nums[0], nums[1]);
        if (nums[0] < nums[nums.length - 1]) return nums[0];
        int left = 0, right = nums.length - 1;
        int answer = 0;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            
            if (middle + 1 < nums.length && nums[middle + 1] < nums[middle]) {
                answer = nums[middle + 1];
                break;
            }
            if (nums[left] <= nums[middle]) left = middle + 1;
            else if (nums[right] >= nums[middle]) right = middle - 1;
        }
        return answer;
    }
}