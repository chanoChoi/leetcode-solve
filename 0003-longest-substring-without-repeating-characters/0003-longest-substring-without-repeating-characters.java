class Solution {
    public int lengthOfLongestSubstring(String s) {
        Deque<Character> queue = new LinkedList<>();
        int longest = 0;
        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                queue.removeFirst();
            }
            queue.addLast(c);
            longest = Math.max(longest, queue.size());
        }
        return longest;
    }
}