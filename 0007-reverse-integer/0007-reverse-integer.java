class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        while (x != 0) {
            int lastDigits = x % 10;
            
            if (reversed > max / 10 || (reversed == max / 10 && lastDigits > 7)) {
                return 0;
            }
            
            if (reversed < min / 10 || (reversed == min / 10 && lastDigits > 8)) {
                return 0;
            }
            
            reversed = reversed * 10 + lastDigits;
            x = x / 10;
        }
        
        return reversed;
    }
}