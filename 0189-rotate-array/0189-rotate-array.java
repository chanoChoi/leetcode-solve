class Solution {
    private <T> void p(T t) {
        System.out.print(t);
    }
    
    private <T> void pln(T t) {
        System.out.println(t);
    }
    
    public void rotate(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;
        // 1. reverse the while array
            reverse(nums, 0, nums.length - 1);
         // 2. reverse the array k 만큼
            reverse(nums, 0, k - 1);    
        // 3. reverse the array other value
        reverse(nums, k, nums.length - 1);
    }
    
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left = left + 1;
            right = right - 1;
        }
    }
}