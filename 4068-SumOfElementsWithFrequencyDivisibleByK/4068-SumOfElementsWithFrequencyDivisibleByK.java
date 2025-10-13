// Last updated: 10/13/2025, 10:17:27 PM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        int res = 0;
        for(int key : map.keySet()) {
            int f = map.get(key);
            if(f % k == 0) {
                res += key * f;
            }
        }
        return res;
    }
}