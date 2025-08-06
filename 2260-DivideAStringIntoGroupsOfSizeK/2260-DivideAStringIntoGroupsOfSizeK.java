// Last updated: 8/6/2025, 11:01:43 AM
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        String[] res = new String[(n + k - 1)/k];
        int i = 0;
        while(i * k + k <= n) {
            res[i] = s.substring(i*k, i*k+k);
            i++;
        }
        if(i*k < n) {
            StringBuilder sb = new StringBuilder();
            sb.append(s.substring(i*k));
            for(int j = n - i*k; j < k; j++) {
                sb.append(fill);
            }
            res[i] = sb.toString();
        }
        return res;
    }
}