class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] chars = new int[26];
        for (char ch : s.toCharArray()) {
            chars[ch - 'a']++;
        }        
        for (char ch : t.toCharArray()) {
            chars[ch - 'a']--;
            if (chars[ch - 'a'] < 0) return false;
        }        
        
        return true;
    }
}

/*
for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
            chars[t.charAt(i) - 'a']--;
}
        */