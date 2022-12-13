class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        answer.add(nums[0]);
        for (int i = 1;i < nums.length; i++) {
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
    
    private int binarySearch(List<Integer> list,int target) {
        int l = 0, r = list.size() - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (target > list.get(m)) l = m + 1;
            else r = m;
        }
        return r;
    }
}