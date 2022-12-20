class Solution {
    public int[] plusOne(int[] digits) {
        Deque<Integer> list = new LinkedList<>();
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            carry = sum / 10;
            list.addFirst(sum % 10);
        }
        if (carry == 1) list.addFirst(1);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}