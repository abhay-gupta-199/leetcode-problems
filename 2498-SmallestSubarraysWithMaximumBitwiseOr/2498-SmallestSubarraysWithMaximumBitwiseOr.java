// Last updated: 8/6/2025, 11:01:21 AM
class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] closest = new int[32];
        Arrays.fill(closest, -1);
        int[] res = new int[n];

        for(int i = n-1; i >= 0; i--) {
            for(int j = 0; j < 32; j++) {
                if((nums[i] & (1 << j)) != 0) closest[j] = i;
            }

            int lastSetBit = i;
            for(int j = 0; j < 32; j++) {
                if(closest[j] != -1) lastSetBit = Math.max(lastSetBit, closest[j]);
            }
            res[i] = lastSetBit - i + 1;
        }
        return res;
    }
}