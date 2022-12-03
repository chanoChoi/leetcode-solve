class Solution {
    public double myPow(double x, int n) {
        // overflow
        long num = n;
        double ans = 1.0;
        boolean minus = false;
        if (n < 0) {
            num = num * -1;
            minus = true;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                ans = ans * x;
                num = num - 1;
            }
        }
        
        return minus ? 1/ans : ans;
    }
}