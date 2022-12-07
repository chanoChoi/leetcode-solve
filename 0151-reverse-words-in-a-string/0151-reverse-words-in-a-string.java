class Solution {
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            if ("".equals(strs[i])) {
                while (i - 1 >= 0 && "".equals(strs[i - 1])) {
                    i--;
                }
            } else {
                sb.append(strs[i]);
                if (i > 0) {
                    sb.append(" ");
                }
            }
        }
        return sb.toString();
    }
}