// Last updated: 9/10/2025, 10:54:42 AM
class Solution {
    public long bowlSubarrays(int[] nums) {
        int n = nums.length;
        int[] l = new int[n];
        int[] r = new int[n];
        int[] st = new int[n];

        int top = 0;
        for(int i = 0; i < n; i++) {
            while(top > 0 && nums[st[top-1]] < nums[i]) top--;
            l[i] = top == 0 ? -1 : st[top-1];
            st[top++] = i;
        }
        top = 0;
        for(int i = n-1; i >= 0; i--) {
            while(top > 0 && nums[st[top-1]] < nums[i]) top--;
            r[i] = top == 0 ? n : st[top-1];
            st[top++] = i;
        }

        long res = 0;
        for(int i = 0; i < n; i++) {
            if(l[i] != -1 && r[i] != n) res++;
        }
        return res;
    }
}