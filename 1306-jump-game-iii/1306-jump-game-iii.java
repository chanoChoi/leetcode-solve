class Solution {
    public boolean canReach(int[] arr, int start) {
        if (start < 0 || start >= arr.length || arr[start] < 0) {
            return false;
        }
        if (arr[start] == 0) {
            return true;
        }
        arr[start] *= -1;
        int move = Math.abs(arr[start]);
        boolean left = canReach(arr, start - move);
        boolean right = canReach(arr, start + move);
        return left || right;
    }
}