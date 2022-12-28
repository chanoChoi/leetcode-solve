class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int cnt = 0;
        for (int key : map.keySet()) {
            if (k == 0) {
                if (map.get(key) >= 2) {
                    cnt++;
                }
            }else if (map.containsKey(key + k)) {
                cnt++;
            }
        }
        
        return cnt;
    }
}