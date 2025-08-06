// Last updated: 8/6/2025, 11:01:01 AM
class Solution {
    public long minSum(int[] num1, int[] num2) {
        long sum1 = 0, sum2 = 0;
        int zer1 = 0, zer2 = 0;
        for(int x : num1) {
            sum1 += x;
            zer1 += x == 0 ? 1 : 0;
        }
        for(int x : num2) {
            sum2 += x;
            zer2 += x == 0 ? 1 : 0;
        }

        if(zer1 == 0 && sum1 < sum2 + zer2 || zer2 == 0 && sum2 < sum1 + zer1) {
            return -1;
        }

        return Math.max(sum1 + zer1, sum2 + zer2);     
    }
}