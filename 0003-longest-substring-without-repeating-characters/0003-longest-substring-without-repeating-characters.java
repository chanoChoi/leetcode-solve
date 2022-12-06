class Solution {
    public int lengthOfLongestSubstring(String s) {
        Deque<Character> queue = new LinkedList<>();
        int cnt = 0;
        for (char ch : s.toCharArray()) {
            while (queue.contains(ch)) {
                queue.removeFirst();
            }
            queue.addLast(ch);
            cnt = Math.max(cnt, queue.size());
        }
        return cnt;
    }
}