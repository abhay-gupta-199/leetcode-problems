// Last updated: 8/6/2025, 11:01:15 AM
class Solution {
    public long countGood(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        long ans = 0, pair = 0;
        int l = 0, r = 0;

        for(r = 0; r < nums.length; r++) {
            int item = nums[r];
            pair += hash.getOrDefault(item, 0);
            hash.put(item, hash.getOrDefault(item, 0) + 1);
            while(pair >= k) {
                ans += nums.length - r;
                int x = nums[l++];
                hash.put(x, hash.get(x) - 1);
                pair -= hash.get(x);
            }
        }
        return ans;
    }
}