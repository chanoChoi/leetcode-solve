class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] cArr = new char[26];
            for (char ch : str.toCharArray()) {
                cArr[ch - 'a']++;
            }
            String key = String.valueOf(cArr);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(str);
        }
        
        return new ArrayList(map.values());
    }
}