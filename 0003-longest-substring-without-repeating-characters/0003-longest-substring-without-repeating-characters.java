class Solution {
    public int lengthOfLongestSubstring(String s) {
        Deque<Character> queue = new LinkedList<>();
        int size = 0;
        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                queue.removeFirst();
            }
            queue.addLast(c);
            size = Math.max(size, queue.size());
        }
        return size;
    }
}