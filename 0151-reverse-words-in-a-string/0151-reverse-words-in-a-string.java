class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        reverse(chars, 0, chars.length - 1);
        reverseWords(chars);
        return cleanSpaces(chars);
    }
    
    private String cleanSpaces(char[] chars) {
        int left = 0;
        int right = 0;
        while (right < chars.length) {
            while (right < chars.length && chars[right] == ' ') right = right + 1;
            while (right < chars.length && chars[right] != ' ') {
                chars[left] = chars[right];
                left = left + 1;
                right = right + 1;
            }
            while (right < chars.length && chars[right] == ' ') right = right + 1;
            if (right < chars.length) {
                chars[left] = ' ';
                left = left + 1;
            }
        }
        return new String(chars).substring(0, left);
    }
    
    private void reverseWords(char[] chars) {
        int left = 0;
        int right = 0;
        while (right < chars.length) {
            while (left < chars.length && chars[left] == ' ') {
                left = left + 1;
            }
            right = left;
            while (right < chars.length && chars[right] != ' ') {
                right = right + 1;
            }
            reverse(chars, left, right - 1);
            left = right;
        }
    }
    
    private void reverse(char[] chars, int left, int right) {
        while(left < right) {
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left = left + 1;
            right = right - 1;
        }
    }
}