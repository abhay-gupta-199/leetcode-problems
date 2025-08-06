// Last updated: 8/6/2025, 11:04:29 AM
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        for(int i = 0; i < cost.length; i++) {
            total += gas[i] - cost[i];
        }
        if(total < 0) {
            return -1;
        }
        int idx = 0, cur = 0;
        for(int i = 0; i < cost.length; i++) {
            cur += gas[i] - cost[i];
            if(cur < 0) {
                cur = 0;
                idx = i+1;
            }
        } return idx;
    }
}