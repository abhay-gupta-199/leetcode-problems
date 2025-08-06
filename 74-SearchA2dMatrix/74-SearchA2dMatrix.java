// Last updated: 8/6/2025, 11:04:49 AM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binary(matrix[row(matrix, target)], target);
    }
    public static int row(int[][] ar, int t) {
        for(int i = ar.length - 1; i >= 0; i--) {
            if(ar[i][0] <= t) {
                return i;
            }
        }
        return 0;
    }
    public static boolean binary(int[] ar, int t) {
        int l = 0, h = ar.length - 1;
        while(l <= h) {
            int mid = (l+h)/2;
            if(ar[mid] == t) {
                return true;
            } else if(ar[mid] > t) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }
}