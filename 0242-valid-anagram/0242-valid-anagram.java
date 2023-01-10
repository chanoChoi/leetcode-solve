class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<String, Integer> map = new HashMap<>();
        char[] chars = new char[26];
        for (char ch : s.toCharArray()) {
            chars[ch - 'a']++;
        }
        map.put(String.valueOf(chars), 1);
        chars = new char[26];
        for (char ch : t.toCharArray()) {
            chars[ch - 'a']++;
        }
        if (map.containsKey(String.valueOf(chars))) {
            return true;
        }
        return false;
    }
}