class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean result = false;
        
        Set<Integer> set = new HashSet<>();
        
        for (int n : nums) {
            if (set.contains(n)) {
                result = true;
                break;
            } else {
                set.add(n);
            }
        }
        
        return result;
    }
}