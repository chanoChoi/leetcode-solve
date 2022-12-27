class Solution {
    public void nextPermutation(int[] nums) {
        boolean flag = false;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                flag = true;
                int targetIdx = find(nums, nums[i - 1], i, nums.length - 1);
                swap(nums, i - 1, targetIdx);
                reverse(nums, i);
                break;
            }
        }
        
        if (!flag) {
            Arrays.sort(nums);
        }
    }
    private int find(int[] nums, int target,int start, int end) {
        int index = -1;
        for (int i = end; i >= start; i--) {
            if (target < nums[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
    
    private void reverse(int[] nums, int l) {
        int r = nums.length - 1;
        while (l < r) {
            swap(nums, l, r);
            l = l + 1;
            r = r - 1;
        }
    }
    
    private void swap(int[] nums, int idx1, int idx2) {
        int tmp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = tmp;
    }
}