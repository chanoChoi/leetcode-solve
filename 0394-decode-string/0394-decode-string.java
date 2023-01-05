class Solution {
    public String decodeString(String s) {
        StringBuilder answer = new StringBuilder();
        Deque<Integer> numStack = new LinkedList<>();
        Deque<String> strStack = new LinkedList<>();
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                int res = ch - '0';
                while (i + 1 < s.length() && Character.isDigit(s.charAt(i + 1))) {
                    ch = s.charAt(i + 1);
                    res = res * 10 + ch - '0';
                    i = i + 1;
                }
                numStack.addLast(res);
            } else if (ch == '[') {
                strStack.addLast(answer.toString());
                answer = new StringBuilder();
            } else if (ch == ']') {
                int k = numStack.removeLast();
                StringBuilder sb = new StringBuilder(strStack.removeLast());
                for (int j = 0; j < k; j++) {
                    sb.append(answer);
                }
                answer = sb;
            } else {
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}