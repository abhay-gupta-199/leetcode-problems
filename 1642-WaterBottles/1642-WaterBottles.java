// Last updated: 10/4/2025, 10:23:41 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty = numBottles, res = numBottles;

        while(empty >= numExchange) {
            int newBottles = empty / numExchange;
            res += newBottles;
            empty = empty % numExchange + newBottles;
        }
        return res;
    }
}