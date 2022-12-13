class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i];
            if (answer.get(answer.size() - 1) < cur) {
                answer.add(cur);
            } else {
                int targetIdx = binarySearch(answer, cur);
                answer.set(targetIdx, cur);
            }
        }
        return answer.size();
    }
//     현재 target에 가장 가까운 수
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