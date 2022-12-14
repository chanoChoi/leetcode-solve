class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        reverse(chars, 0, chars.length - 1);
        reverseWords(chars);
        return removeSpaces(chars);
    }
    
    private String removeSpaces(char[] chars) {
        int left = 0, right = 0;
        int len = chars.length;
        while (right < len) {
            while (right < len && Character.isSpace(chars[right])) {
                right = right + 1;
            }
            while (right < len && Character.isLetterOrDigit(chars[right])) {
                chars[left] = chars[right];
                left = left + 1;
                right = right + 1;
            }
            while (right < len && Character.isSpace(chars[right])) {
                right = right + 1;
            }
            if (right < len) {
                chars[left] = ' ';
                left = left + 1;
            }
        }
        return String.valueOf(chars).substring(0, left);
    }
    
    private void reverseWords(char[] chars) {
        int left = 0, right = 0;
        int len = chars.length;
        while (right < len) {
            while (left < len && Character.isSpace(chars[left])) {
                left = left + 1;
            }
            right = left;
            while (right < len && Character.isLetterOrDigit(chars[right])) {
                right = right + 1;
            }
            reverse(chars, left, right - 1);
            left = right;
        }
    }
    
    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left = left + 1;
            right = right - 1;
        }
    }
}