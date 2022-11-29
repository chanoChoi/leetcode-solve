class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        String numStr = Integer.toString(x);
        int start = 0;
        int end = numStr.length() - 1;
        while (start < end) {
            char c1 = numStr.charAt(start++);
            char c2 = numStr.charAt(end--);
            if (c1 != c2) {
                return false;
            }
        }
        
        return true;
    }
}