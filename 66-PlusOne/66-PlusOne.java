// Last updated: 8/6/2025, 11:04:54 AM
class Solution {
    public int[] plusOne(int[] digits) {
        int[] dig = new int[digits.length + 1];
        for(int i = digits.length - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            dig[i+1] = digits[i];
            if(digits[i] != 0) {
                return digits;
            }
        }
        dig[0] = 1;
        return dig;
    }
}