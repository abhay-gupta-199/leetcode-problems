// Last updated: 8/6/2025, 11:01:44 AM
class Solution {
    public int numberOfArrays(int[] difs, int l, int u) {
        long sum = 0, max = 0, min = 0;
        for(int item : difs) {
            sum += item;
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }
        return (int) Math.max(0, u - l - max + min + 1);
    }
}