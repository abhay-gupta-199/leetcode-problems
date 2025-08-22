class Solution {
    public int bulbSwitch(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++) {
            int x = (int) Math.sqrt(i);
            if(x * x == i) res++;
        }
        return res;
    }
}