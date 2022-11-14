class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    
    public int climbStairs(int n) {
        return helper(n);
    }
    
    public int helper(int n) {
        if (n < 4) return n;
        
        if (map.containsKey(n)) {
            return map.get(n);
        }
        
        int result = helper(n - 1) + helper(n - 2);
        map.put(n, result);
        
        return result;
    }
}