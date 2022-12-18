class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (list.get(list.size() - 1) < cur) {
                list.add(cur);
            } else {
                int targetIdx = binarySearch(list, cur);
                list.set(targetIdx, cur);
            }
        }
        return list.size();
    }
    
    private int binarySearch(List<Integer> nums, int target) {
        int l = 0, r = nums.size() - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (target > nums.get(m)) l = m + 1;
            else r = m;
        }
        return l;
    } 
}