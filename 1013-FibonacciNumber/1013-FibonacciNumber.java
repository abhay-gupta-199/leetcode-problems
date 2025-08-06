// Last updated: 8/6/2025, 11:02:55 AM
class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for(int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}