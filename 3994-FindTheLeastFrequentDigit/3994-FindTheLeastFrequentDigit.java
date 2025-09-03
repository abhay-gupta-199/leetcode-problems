// Last updated: 9/3/2025, 12:29:10 PM
class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];
        while(n > 0) {
            int d = n % 10;
            freq[d]++;
            n /= 10;
        }

        int res = -1, min = 100;
        for(int i = 0; i <= 9; i++) {
            if(freq[i] == 0) continue;
            if(freq[i] < min) {
                min = freq[i];
                res = i;
            }
        }
        return res;
    }
}