// Last updated: 8/6/2025, 11:04:16 AM
import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        Reverse(nums, 0, n-k);
        Reverse(nums, n-k, n);
        Reverse(nums, 0, n);
    }
    static void Reverse(int arr[], int i, int j) {
        j -= 1;
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}