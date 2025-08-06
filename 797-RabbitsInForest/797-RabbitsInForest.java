// Last updated: 8/6/2025, 11:03:13 AM
class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int x : answers) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int res = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            res += Math.ceil((double)entry.getValue() / (entry.getKey()+1)) * (entry.getKey()+1);
        }
        return res;
    }
}