class Solution {
    public void moveZeroes(int[] nums) {
        int posZero = 0;
        
        for (int n : nums) {
            if (n != 0) nums[posZero++] = n;
        }
        
        while (posZero < nums.length) {
            nums[posZero++] = 0;
        }
    }
}