class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 1 && Character.isSpace(s.charAt(0))) return 0;
        
        int idx = s.length() - 1;
        while (Character.isSpace(s.charAt(idx))) {
            idx = idx - 1;
        }
        
        int answer = 0;
        while (idx >= 0 && !Character.isSpace(s.charAt(idx))) {
            idx = idx - 1;
            answer = answer + 1;
        }
        return answer;
    }
}