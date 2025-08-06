// Last updated: 8/6/2025, 11:03:48 AM
class Solution {
    public int getSum(int a, int b) {
        while(b != 0) {
            int sum = a & b;
            a = a ^ b;
            b = sum << 1;
        }
        return a;
    }
}