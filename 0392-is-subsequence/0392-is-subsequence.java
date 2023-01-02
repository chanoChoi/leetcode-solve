class Solution {
    public boolean isSubsequence(String s, String t) {
        int idx = 0;
        int idx2 = 0;
        while (idx < s.length() && idx2 < t.length()) {
            if (s.charAt(idx) == t.charAt(idx2)) {
                idx++;
            }
            idx2++;
        }
        return idx == s.length();
    }
}