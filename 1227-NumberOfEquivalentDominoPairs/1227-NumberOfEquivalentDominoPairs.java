// Last updated: 8/6/2025, 11:02:45 AM
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int[] x : dominoes) {
            int key = x[0] < x[1] ? x[0]*10 + x[1] : x[1]*10 + x[0];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        int res = 0;
        for(int key : map.keySet()) {
            int val = map.get(key);
            res += val * (val-1) / 2;
        }
        return res;
    }
}