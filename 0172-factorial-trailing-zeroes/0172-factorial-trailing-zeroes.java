class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;
        int idx = 5;
        while (idx <= n) {
            cnt = cnt + n / idx;
            idx = idx * 5;
        }
        return cnt;
        
    }
}