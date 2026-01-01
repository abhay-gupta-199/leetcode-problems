// Last updated: 1/1/2026, 11:01:55 AM
1class Solution {
2    public int[] plusOne(int[] digits) {
3        int[] dig = new int[digits.length + 1];
4        for(int i = digits.length - 1; i >= 0; i--) {
5            digits[i] = (digits[i] + 1) % 10;
6            dig[i+1] = digits[i];
7            if(digits[i] != 0) {
8                return digits;
9            }
10        }
11        dig[0] = 1;
12        return dig;
13    }
14}