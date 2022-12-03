class Solution {
    public int lengthOfLongestSubstring(String s) {
        int cnt = 0;
        Deque<Character> queue = new LinkedList<>();
        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                queue.removeFirst();
            }
            queue.addLast(c);
            cnt = Math.max(cnt, queue.size());
        }
        return cnt;
    }
}