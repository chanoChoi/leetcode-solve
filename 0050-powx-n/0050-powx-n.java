class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long num = n;
        if (n < 0) {
            num = num * -1;
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
        return n < 0 ? 1.0/ans : ans;
    }
}

// if (n == 0 || x == 1) return 1;
//         if (n == 1) return x;
//         if (n == -1) return 1/x;
//         if(x == 0) return 0;
//         if(x == -1) return -1;
//         double ans = 1;
//         int signal = 0;
//         if (n < 0) {
//             signal = -1;
//             n *= -1;    
//         };
//         while (n > 0) {
//             if (n % 2 == 0) {
//                 x = x * x;
//                 n = n / 2;
//             } else {
//                 ans = ans * x;
//                 n = n - 1;
//             }
//         }
//         return signal == -1 ? 1.0/ans : ans;