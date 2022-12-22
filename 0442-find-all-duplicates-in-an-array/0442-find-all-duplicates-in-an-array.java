class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int targetIdx = Math.abs(nums[i]) - 1;
            if (nums[targetIdx] < 0) list.add(targetIdx + 1);
            else nums[targetIdx] *= -1;
        }
        return list;
    }
}

