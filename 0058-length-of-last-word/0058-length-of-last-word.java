class Solution {
    public int lengthOfLastWord(String s) {
        int cnt = 0;
        int idx = s.length() - 1;
        while (idx >= 0 && s.charAt(idx) == ' ') {
            idx = idx - 1;
        }
        while (idx >= 0 && s.charAt(idx) != ' ') {
            cnt = cnt + 1;
            idx = idx - 1;
        }

        return cnt;
    }
}