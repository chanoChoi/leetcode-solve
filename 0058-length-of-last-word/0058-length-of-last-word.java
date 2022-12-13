class Solution {
    public int lengthOfLastWord(String s) {
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i = i - 1;
            }
            while (i >= 0 && s.charAt(i) != ' ') {
                cnt = cnt + 1;
                i = i - 1;
            }
            break;
        }
        return cnt;
    }
}