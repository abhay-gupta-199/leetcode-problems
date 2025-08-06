// Last updated: 8/6/2025, 11:01:05 AM
class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int mod, int k) {
        long c = 0, eq = 0;
        Map<Integer, Long> map = new HashMap<>();
        map.put(0, 1L);
        for(int val : nums) {
            if(val % mod == k) eq++;
            int rem = (int) eq % mod;
            int req = (rem - k + mod) % mod;
            c += map.getOrDefault(req, 0L);
            map.put(rem, map.getOrDefault(rem, 0L) + 1);
        }
        return c;
    }
}