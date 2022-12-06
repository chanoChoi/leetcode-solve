class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> stack = new LinkedList<>();
        stack.addLast(-1);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.addLast(i);
            } else if (ch ==')') {
                stack.removeLast();
                if (stack.isEmpty()) {
                    stack.addLast(i);
                }
                ans = Math.max(ans, i - stack.peekLast());
            }
        }
        return ans;
    }
}