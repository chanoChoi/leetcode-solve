class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        int curr = answer.length - 1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int tmpLeft = nums[left] * nums[left];
            int tmpRight = nums[right] * nums[right];
            if (tmpLeft > tmpRight) {
                answer[curr] = tmpLeft;
                curr--;
                left++;
            } else {
                answer[curr] = tmpRight;
                curr--;
                right--;
            }
        }
        return answer;
    }
}