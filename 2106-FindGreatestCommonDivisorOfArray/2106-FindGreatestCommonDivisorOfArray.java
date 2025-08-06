// Last updated: 8/6/2025, 11:02:03 AM
class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int x : nums) {
            min = Math.min(x, min);
            max = Math.max(x, max);
        }
        return gcd(min, max);
    }
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}