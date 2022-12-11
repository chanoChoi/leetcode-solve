class Solution {
    public double myPow(double x, int n) {
        long num = n;
        double res = 1;
        if (n < 0) {
            num = num * -1;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                res = res * x;
                num = num - 1;
            }
        }
        return n < 0 ? 1/res : res;
    }
}