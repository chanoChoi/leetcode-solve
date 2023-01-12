class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        
        for (int i = 0, j = 1; i < answer.length; i++) {
            answer[i] = j;
            j = nums[i] * j;
        }
        
        for (int i = answer.length - 1, j = 1; i >= 0; i--) {
            answer[i] = answer[i] * j;
            j = nums[i] * j;
        }
        
        return answer;
    }
}

/*
초기값 1 설정


*/