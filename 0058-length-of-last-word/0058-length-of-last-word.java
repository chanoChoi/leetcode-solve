class Solution {
    public int lengthOfLastWord(String s) {
        int lastIdx = s.length() - 1;
        while (Character.isSpace(s.charAt(lastIdx))) {
            lastIdx = lastIdx - 1;
        }
        int cnt = 0;
        while (lastIdx >= 0 && Character.isLetter(s.charAt(lastIdx))) {
            cnt = cnt + 1;
            lastIdx = lastIdx - 1;
        }
        return cnt;
    }
}