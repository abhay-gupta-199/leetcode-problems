// Last updated: 10/1/2025, 12:00:40 AM
class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return maxK(nums, k) - maxK(nums, k-1);
    }

    int maxK(int[] nums, int k) {
        int n = nums.length;
        int l = 0, res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int r = 0; r < n; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while(map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if(map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }
            res += r - l + 1;
        }
        return res;
    }
}