// Last updated: 8/6/2025, 11:03:06 AM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        long total = 0;
        for(int x : piles) {
            total += x;
        }
        int low = (int) (total - 1)/h + 1;
        int high = (int) ((total - (n-1) - 1)/(h - (n-1))) + 1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(isDone(piles, h, mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public static boolean isDone(int[] piles, int h, int mid) {
        long count = 0;
        for(int x : piles) {
            count += (x + mid - 1)/mid;
        }
        return count <= h;
    }
}
