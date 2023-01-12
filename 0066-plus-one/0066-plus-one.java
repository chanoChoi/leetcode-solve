class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int lastDigit = digits[i] + carry;
            carry = lastDigit / 10;
            digits[i] = lastDigit % 10;
        }
        if (carry == 1) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, digits.length);
            return ans;
        }
        
        return digits;
    }
}