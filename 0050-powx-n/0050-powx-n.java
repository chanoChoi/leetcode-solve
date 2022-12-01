class Solution {
    public double myPow(double x, int n) {
        long num = n;
        if (n < 0) {
            num = num * -1;
        }
        double ans = 1.0;
        while (num > 0) {
           if (num % 2 == 0) {
               x = x * x;
               num = num / 2;
           } else {
               ans = ans * x;
               num = num - 1;
           }
        }
        
        return n < 0 ? 1.0/ans : ans;
    }
}