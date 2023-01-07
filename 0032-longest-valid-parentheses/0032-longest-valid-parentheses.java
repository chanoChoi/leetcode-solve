class Solution {
    public int longestValidParentheses(String s) {
        int cnt = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.addLast(-1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.addLast(i);
            } else {
                stack.removeLast();
                if (stack.isEmpty()) {
                    stack.addLast(i);
                }
                cnt = Math.max(cnt, i - stack.peekLast());
            }
        }
        return cnt;
    }
}