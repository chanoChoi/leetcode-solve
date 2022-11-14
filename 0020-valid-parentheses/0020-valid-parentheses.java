class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.addLast(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char currBracket = stack.removeLast();
            if (currBracket == '(' && c != ')') return false;
            if (currBracket == '{' && c != '}') return false;
            if (currBracket == '[' && c != ']') return false;
        }
        
        return stack.isEmpty();
    }
}