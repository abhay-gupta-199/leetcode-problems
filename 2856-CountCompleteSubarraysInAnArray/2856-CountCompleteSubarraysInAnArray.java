// Last updated: 8/6/2025, 11:01:07 AM
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int l = 0, ans = 0;
        int n = (int) Arrays.stream(nums).distinct().count();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            while(map.size() == n) {
                ans += nums.length - i;
                map.put(nums[l], map.get(nums[l]) - 1);
                if(map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }
        }
        return ans;
    }
}