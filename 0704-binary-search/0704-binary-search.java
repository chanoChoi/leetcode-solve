class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length, target);
    }
    
    private int binarySearch(int[] nums, int left, int right, int target) {
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid;
        }
        return -1;
    }
}