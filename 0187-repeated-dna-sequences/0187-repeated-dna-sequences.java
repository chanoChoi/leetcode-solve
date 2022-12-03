class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> answer = new HashSet<>();
        Set<String> container = new HashSet<>();
        int len = s.length();
        int idx = 0;
        while (idx <= len - 10) {
            String substr = s.substring(idx, idx + 10);
            if (container.contains(substr)) answer.add(substr);
            else container.add(substr);
            idx = idx + 1;
        }
        return new ArrayList(answer);
    }
}