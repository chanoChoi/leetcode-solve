class Solution {
    public String decodeString(String s) {
        Deque<String> strStack = new LinkedList<>();
        Deque<Integer> numStack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int num = ch - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    num = num * 10 + (s.charAt(i + 1) - '0');
                    i = i + 1;
                }
                numStack.addLast(num);
            } else if (ch == '[') {
                strStack.addLast(sb.toString());
                sb = new StringBuilder();
            } else if (ch == ']') {
                int k = numStack.removeLast();
                StringBuilder tmp = new StringBuilder(strStack.removeLast());
                for (int j = 0; j < k; j++) {
                    tmp.append(sb);
                }
                sb = tmp;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}