// Last updated: 8/6/2025, 11:05:44 AM
class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length-1;
        int res = 0;
        while(l < r) {
            int minHeight = Math.min(height[l], height[r]);
            int area = (r-l) * minHeight;
            res = area > res ? area : res;
            while(l < r && height[l] <= minHeight) {
                l++;
            }
            while(l < r && height[r] <= minHeight) {
                r--;
            }
        }
        return res;
    }
}