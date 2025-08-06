// Last updated: 8/6/2025, 11:03:18 AM
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0, si = 0, ei = 0, p = 1;
		while(ei < nums.length) {
			//grow
			p *= nums[ei];
			
			//shrink
			while(p >= k && si<= ei) {
				p /= nums[si];
				si++;
			}
			// ans update
			ans += (ei-si+1);
			ei++;
		}
		return ans;
    }
}