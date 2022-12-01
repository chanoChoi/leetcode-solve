class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) return Collections.<String>emptyList();
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int idx = 0;
        while (idx <= s.length() - 10) {
            String subStr = s.substring(idx, idx + 10);
            map.put(subStr, map.getOrDefault(subStr, 0) + 1);
            idx = idx + 1;
        }
        
        for (Map.Entry<String,Integer> item : map.entrySet()) {
            if (item.getValue() > 1) {
                ans.add(item.getKey());
            }
        }
        
        return ans;
    }
}