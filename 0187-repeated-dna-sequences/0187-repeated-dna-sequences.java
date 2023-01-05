class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> backup = new HashSet<>();
        Set<String> list = new HashSet<>();
        for (int i = 0; i + 10 <= s.length(); i++) {
            String substr = s.substring(i, i + 10);
            if (backup.contains(substr)) {
                list.add(substr);
            }
            backup.add(substr);
        }
        return new ArrayList(list);
    }
}