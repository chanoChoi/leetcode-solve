class Solution {
    public boolean isPalindrome(int x) {
        if (x < 10 && x >= 0) return true;
        if (x < 0 || (x > 9 && x % 10 == 0)) return false;
        
        int reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
            if (x > reversed) continue;
            else if (x == reversed / 10 || x == reversed) return true;
        }
        
        return false;
    }
}

