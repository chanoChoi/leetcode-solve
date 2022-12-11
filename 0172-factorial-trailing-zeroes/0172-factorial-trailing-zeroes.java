class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;
        int idx = 5;
        while (n >= idx) {
            cnt = cnt + (n / idx);
            idx = idx * 5;
        }
        return cnt;
    }
}