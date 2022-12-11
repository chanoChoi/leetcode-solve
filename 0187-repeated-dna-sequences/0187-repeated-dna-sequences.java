class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> dup = new HashSet<>();
        Set<String> answer = new HashSet<>();
        int idx = 0;
        while (idx + 10 <= s.length()) {
            String subStr = s.substring(idx, idx + 10);
            if (dup.contains(subStr)) {
                answer.add(subStr);
            } else {
                dup.add(subStr);
            }
            idx = idx + 1;
        }
        return answer.stream().collect(Collectors.toList());
    }
}