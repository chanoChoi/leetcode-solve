class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;
        int x = 5;
        while (x <= n) {
            cnt = cnt + n / x;
            x = x * 5;
        }
        return cnt;
    }
}