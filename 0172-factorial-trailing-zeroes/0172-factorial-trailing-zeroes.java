class Solution {
    public int trailingZeroes(int n) {
        if (n < 5) return 0;
        int cnt = 0;
        int i = 5;
        while (i <= n) {
            cnt = cnt + (n / i);
            i = i * 5;
        }

        return cnt;
    }
}