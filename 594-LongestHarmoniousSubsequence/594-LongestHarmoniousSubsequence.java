// Last updated: 8/6/2025, 11:03:22 AM
class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int res = 0;
        for(int key : freq.keySet()) {
            if(freq.containsKey(key + 1)) {
                res = Math.max(res, freq.get(key) + freq.get(key + 1));
            }
        }

        return res;
    }
}