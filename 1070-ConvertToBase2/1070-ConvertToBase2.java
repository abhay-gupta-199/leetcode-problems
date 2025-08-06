// Last updated: 8/6/2025, 11:02:48 AM
class Solution {
    public String baseNeg2(int n) {
        if(n == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();

        while(n != 0) {
            int r = n % -2;
            n /= -2;
            if(r < 0) {
                r += 2;
                n += 1;
            }
            res.append(r);
        }
        return res.reverse().toString();
    }
}