class Solution {
    public static HashMap<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        return this.recursive(n);
    }

    public int recursive(int n) {
        if (n < 4) {
            return n;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        } 
        int result = recursive(n - 1) + recursive(n - 2);
        map.put(n, result);
        return result;
    }
}