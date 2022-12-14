class Solution {
    int start = 0, end = 0;
    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            expendAroundCenter(s, i, i);
            expendAroundCenter(s, i, i + 1);
        }
        return s.substring(start, end + 1);
    }
    
    private void expendAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left = left - 1;
            right = right + 1;
        }
        left = left + 1;
        right = right - 1;
        if (end - start + 1 < right - left + 1) {
            start = left;
            end = right;
        }
    }
}