// Last updated: 8/6/2025, 11:01:09 AM
class Solution {
    public boolean doesValidArrayExist(int[] d) {
        int a = 1;
        for(int i = 0; i < d.length; i++) {
            a ^= d[i];
        }
        return a == 1;
    }
}