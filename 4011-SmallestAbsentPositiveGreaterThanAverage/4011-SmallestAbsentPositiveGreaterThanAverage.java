// Last updated: 9/14/2025, 7:54:23 AM
class Solution {
    public int smallestAbsent(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        
        for(int x : nums) sum += x;
        int avg = (int) Math.ceil(sum / n) + 1;

        int l = (avg <= 0) ? 1 : avg;

        for(int x : nums) {
            if(x == l) l++;
            else if(x > l) break;
        }

        return l;
    }
}