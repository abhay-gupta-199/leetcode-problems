// Last updated: 10/13/2025, 10:18:09 PM
class Solution {
    public long maximumTotalDamage(int[] power) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int x : power) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int n = map.size();
        int[] nums = new int[n];
        int idx = 0;
        for(int key : map.keySet()) {
            nums[idx++] = key;
        }
        Arrays.sort(nums);

        long[] dp = new long[n+1];
        for(int i = n-1; i >= 0; i--) {
            long skip = dp[i+1];

            int j = search(nums, i);
            long take = 1L * nums[i] * map.get(nums[i]) + dp[j];

            dp[i] = Math.max(skip, take);
        }

        return dp[0];
    }

    int search(int[] nums, int i) {
        int x = nums[i];
        int l = i+1, r = nums.length - 1;

        while(l <= r) {
            int mid = l + (r-l)/2;
            if(nums[mid] >= x + 3) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}