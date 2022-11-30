class Solution {
    public int trailingZeroes(int n) {
        // 10 == 2 * 5  2가 더 많다. 5가 몇개나 나오는지 확인. 
        int cnt = 0;
        int idx = 5;
        while (n >= idx) {
            cnt += n / idx;
            idx = idx * 5;
        }
            
    return cnt;
    }
}
