// Last updated: 8/6/2025, 11:03:08 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0, high = arr.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if((mid == 0 ? true : arr[mid] > arr[mid-1]) && (mid == arr.length-1 ? true : arr[mid] > arr[mid+1]))
                return mid;
            else if(arr[mid] <= arr[mid+1])
                low = mid + 1;
            else if(arr[mid] <= arr[mid-1])
                high = mid - 1;
        }
        return -1;
    }
}