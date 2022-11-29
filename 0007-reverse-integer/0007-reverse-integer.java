class Solution {
    public int reverse(int x) {
        int reverse = 0;
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        while (x != 0) {
            int lastDigit = x % 10;
            if (reverse > max / 10 || (reverse == max / 10 && lastDigit > 7)) 
                return 0;
            if (reverse < min / 10 || (reverse == min / 10 && lastDigit < -8))
                return 0;
            
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return reverse;
    }
}