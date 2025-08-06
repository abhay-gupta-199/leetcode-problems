// Last updated: 8/6/2025, 11:02:51 AM
class Solution {
    public int minDominoRotations(int[] tops, int[] bots) {
        int res1 = check(tops[0], tops, bots);
        int res2 = check(bots[0], tops, bots);
        int res = res1 < res2 ? res1 : res2;
        return res == Integer.MAX_VALUE ? -1 : res;
    }
    public int check(int tar, int[] tops, int[] bots) {
        int top = 0, bot = 0;
        for(int i = 0; i < tops.length; i++) {
            if(tops[i] != tar && bots[i] != tar) {
                return Integer.MAX_VALUE;
            } if(tops[i] != tar) {
                top++;
            } if(bots[i] != tar) {
                bot++;
            }
        }
        return top < bot ? top : bot;
    }
}