// Last updated: 8/6/2025, 11:02:30 AM
class Solution {
    public int findLucky(int[] arr) {
        int[] hash = new int[501];

        for(int x : arr) hash[x]++;

        for(int i = 500; i > 0; i--) {
            if(hash[i] == i) return i;
        }

        return -1;
    }
}