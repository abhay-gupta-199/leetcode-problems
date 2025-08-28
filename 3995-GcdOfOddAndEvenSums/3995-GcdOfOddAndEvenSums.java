// Last updated: 8/28/2025, 12:03:41 PM
class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum = (n * (n+1))/2;

        return gcd(sum*2 - n, sum*2);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }
}