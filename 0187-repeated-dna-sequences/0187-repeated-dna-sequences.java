class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> duplication = new HashSet<>();
        Set<String> ans = new HashSet<>();
        int len = s.length();
        for (int i = 0; i <= len - 10; i++) {
               String substr = s.substring(i, i + 10);
            if (duplication.contains(substr)) {
                ans.add(substr);
            } else {
                duplication.add(substr);
            }
        }
        return ans.stream().collect(Collectors.toList());
    }
}