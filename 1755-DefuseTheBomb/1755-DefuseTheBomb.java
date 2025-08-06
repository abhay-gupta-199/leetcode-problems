// Last updated: 8/6/2025, 11:02:24 AM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ar = new int[n];
        if(k > 0) {
            for(int i = 0; i < n; i++) {
                int sum = 0;
                for(int j = 1; j <= k; j++) {
                    if(i + j < n) {
                        sum += code[i + j];
                    } else {
                        sum += code[i + j - n];
                    }
                }
                ar[i] = sum;
            }
        }
        else if(k < 0) {
            for(int i = 0; i < n; i++) {
                int sum = 0;
                for(int j = -1; j >= k; j--) {
                    if(i + j >= 0) {
                        sum += code[i + j];
                    } else {
                        sum += code[i + j + n];
                    }
                }
                ar[i] = sum;
            }
        }
        return ar;
    }
}