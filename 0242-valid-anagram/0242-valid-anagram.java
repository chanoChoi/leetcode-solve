class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] chars = new int[26];
        for (char ch : s.toCharArray()) {
            chars[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            chars[ch - 'a']--;
        }
        for (int n : chars) {
            if (n != 0) return false;
        }
        
        return true;
    }
}