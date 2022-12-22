class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
             int targetIdx = Math.abs(nums[i]) - 1;
            if (nums[targetIdx] > 0) nums[targetIdx] = nums[targetIdx] * -1;   
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
}