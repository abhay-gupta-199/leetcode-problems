// Last updated: 8/28/2025, 12:03:44 PM
class Solution {
    public boolean partitionArray(int[] nums, int k) {
        int n = nums.length;
        if(n % k != 0) return false;
        int grps = n / k;

        Map<Integer, Integer> map = new HashMap<>();
        for(int x : nums) map.put(x, map.getOrDefault(x, 0) + 1);
        for(int f : map.values()) {
            if(f > grps) return false;
        }
        return true;
    }
}