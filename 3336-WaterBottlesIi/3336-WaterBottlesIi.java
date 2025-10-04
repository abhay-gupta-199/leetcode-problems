// Last updated: 10/4/2025, 10:22:26 AM
class Solution {
    public int maxBottlesDrunk(int fill, int exg) {
        int empty = 0, res = 0;
        while(fill > 0 || empty >= exg) {
            if(empty < exg) {
                res += fill;
                empty += fill;
                fill = 0;
            } else {
                fill++;
                empty -= exg;
                exg++;
            }
        }
        return res;
    }
}