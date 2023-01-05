class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reverse = 0;
        while (reverse < x) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        return reverse == x || reverse / 10 == x;
    }
}