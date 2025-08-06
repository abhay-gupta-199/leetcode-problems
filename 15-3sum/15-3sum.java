// Last updated: 8/6/2025, 11:05:37 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;

            int j = i + 1;
            int k = n - 1;

            while(j < k) {
                if(nums[i] + nums[j] + nums[k] < 0)  {
                    j++;
                } else if(nums[i] + nums[j] + nums[k] > 0)  {
                    k--;
                } else {
                    l.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while(nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return l;
    }
}