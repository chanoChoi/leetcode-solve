class Solution {
    public String decodeString(String s) {
        Deque<Integer> numStack = new LinkedList<>();
        Deque<String> strStack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int num = ch - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    int lastDigit = s.charAt(i + 1) - '0';
                    num = num * 10 + lastDigit;
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