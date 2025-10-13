// Last updated: 10/13/2025, 10:18:12 PM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int res = Integer.MIN_VALUE;

        for(int i = n-k; i < n; i++) {
            int temp = 0;
            for(int j = i; j >= 0; j -= k) {
                temp += energy[j];
                res = Math.max(res, temp);
            }
        }

        return res;
    }
}