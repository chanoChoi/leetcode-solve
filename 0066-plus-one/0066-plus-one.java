class Solution {
    public int[] plusOne(int[] digits) {
        int[] answer = new int[digits.length + 1];
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int lastDigit = digits[i];
            int tmp = lastDigit + carry;
            carry = tmp / 10;
            digits[i] = tmp % 10;
        }
        if (carry == 1) {
            System.arraycopy(digits, 0, answer, 1, digits.length);
            answer[0] = 1;
            
        }
        return answer[0] == 1 ? answer : digits;
    }
}