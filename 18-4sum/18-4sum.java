// Last updated: 8/6/2025, 11:05:32 AM
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;
        long sum = 0;
        for(int i = 0; i < n - 3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i + 1; j < n - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j-1]) continue;
                int l = j + 1, r = n - 1;
                while(l < r) {
                    sum = 0L + nums[i] + nums[j] + nums[l] + nums[r];
                    if(sum < target) l++;
                    else if(sum > target) r--;
                    else {
                        ans.add(List.of(nums[i], nums[j], nums[l], nums[r]));
                        do l++;
                        while(l < r && nums[l] == nums[l-1]);
                        do r--;
                        while(l < r && nums[r] == nums[r+1]);
                    }
                    while(l > j + 1 && nums[l] == nums[l-1] && l < r) l++;
                }
            }
        }
        return ans;
    }
}