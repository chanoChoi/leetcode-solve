class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) return Collections.<String>emptyList();
        
        Set<String> set = new HashSet<>();
        Set<String> list = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String subStr = s.substring(i, i + 10);
            if (set.contains(subStr)) list.add(subStr);
            else set.add(subStr);
        }
        
        return new ArrayList(list);
    }
}