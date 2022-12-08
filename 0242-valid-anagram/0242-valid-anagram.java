class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        String s1 = Arrays.stream(s.split("")).sorted().collect(Collectors.joining());
        String t1 = Arrays.stream(t.split("")).sorted().collect(Collectors.joining());
        
        
        return s1.equals(t1);
    }
}