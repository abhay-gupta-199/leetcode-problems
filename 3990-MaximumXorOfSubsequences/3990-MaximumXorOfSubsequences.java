// Last updated: 9/14/2025, 7:54:26 AM
class Solution {
    public int maxXorSubsequences(int[] nums) {
        int B = 31;
        int[] basis = new int[B];

        for(int x : nums) {
            int y = x;
            for(int b = B - 1; b >= 0 && y != 0; b--) {
                if(((y >> b) & 1) == 0) continue;
                if(basis[b] == 0) {
                    basis[b] = y;
                    break;
                } else {
                    y ^= basis[b];
                }
            }
        }

        int res = 0;
        for(int b = B - 1; b >= 0; b--) {
            if((res ^ basis[b]) > res) {
                res ^= basis[b];
            }
        }
        return res;
    }
}