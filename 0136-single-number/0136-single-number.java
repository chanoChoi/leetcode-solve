class Solution {
    public int singleNumber(int[] nums) {
        // set TC = O(n) SC = O(n)
//         xor TC = O(n) SC = O(1)
        int res = 0;
        for (int n : nums) {
            res ^= n;
        }
        return res;
    }
}