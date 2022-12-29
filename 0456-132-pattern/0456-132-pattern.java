class Solution {
    public boolean find132pattern(int[] nums) {
        int[] mins = new int[nums.length];
        mins[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            mins[i] = Math.min(mins[i - 1], nums[i]);
        }
        Deque<Integer> stack = new LinkedList<>();
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > mins[i - 1]) {
                while(!stack.isEmpty() && stack.peekLast() <= mins[i - 1]) {
                    stack.removeLast();
                }
                if(!stack.isEmpty() && stack.peekLast() < nums[i]) {
                    return true;
                }
                stack.addLast(nums[i]);
            }
        }
        return false;
    }
}