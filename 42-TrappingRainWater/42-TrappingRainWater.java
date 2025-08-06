// Last updated: 8/6/2025, 11:05:05 AM
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int sum = 0;
        int[] L = new int[n];
        int[] R = new int[n];
        L[0] = height[0];
        R[n-1] = height[n-1];
        for(int i = 1; i < n; i++) {
            L[i] = Math.max(L[i-1], height[i]);
            R[n-i-1] = Math.max(R[n-i], height[n-i-1]);
        }
        for(int i = 0; i < n; i++) {
            sum += Math.min(L[i], R[i]) - height[i];
        }
        return sum;
    }
}
