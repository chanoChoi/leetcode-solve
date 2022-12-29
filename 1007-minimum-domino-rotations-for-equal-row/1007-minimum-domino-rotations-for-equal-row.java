class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int ans = -1;
        for (int i = 1; i <= 6; i++) {
            int curAns = helper(tops, bottoms, i);
            if (curAns != -1 && (ans != -1 || ans < curAns)) {
                ans = curAns;
            }
        }
        return ans;
    }
    
    public int helper(int[] tops, int[] bottoms, int val) {
        int ansTop = 0, ansBottom = 0;
        for (int i = 0; i < tops.length; i++) {
            int top = tops[i];
            int bottom = bottoms[i];
            if (top != val && bottom != val) {
                return -1;
            }
            if (top != val) {
                ansTop++;
            } else if (bottom != val) {
                ansBottom++;
            }
        }
        return Math.min(ansTop, ansBottom);
    }
}