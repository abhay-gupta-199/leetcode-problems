// Last updated: 8/6/2025, 11:05:47 AM
class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int i = 0;
        long n = 0;

        while(i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        while(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if(s.charAt(i) == '-') sign = -1;
            i++;
            break;
        }

        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            n = n*10 + (s.charAt(i) - 48);
            if((sign * n) > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if((sign * n) < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (sign * n);
    }
}