class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int n1 = height[left];
            int n2 = height[right];
            int h = Math.min(n1, n2);
            int w = right - left;
            max = Math.max(max, h * w);
            if (n2 <= n1) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}