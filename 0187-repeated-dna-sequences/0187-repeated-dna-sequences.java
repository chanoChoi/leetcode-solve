class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) return Collections.<String>emptyList();
        int idx = 0;
        Map<String, Integer> map = new HashMap<>();
        while (idx <= s.length() - 10) {
            String subStr = s.substring(idx, idx + 10);
            map.put(subStr, map.getOrDefault(subStr, 0) + 1);
            idx++;
        }
        
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            if (item.getValue() >= 2) {
                res.add(item.getKey());
            }
        }
        
        return res;
    }
}