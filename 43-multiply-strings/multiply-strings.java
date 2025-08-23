class Solution {
    public String multiply(String a, String b) {
        if(a.equals("0") || b.equals("0")) return "0";
        int n = a.length();
        int m = b.length();
        int[] prod = new int[n + m];

        for(int i = n-1; i >= 0; i--) {
            for(int j = m-1; j >= 0; j--) {
                int p = (a.charAt(i) - '0') * (b.charAt(j) - '0');
                int s = prod[i+j+1] + p;
                prod[i+j] += s / 10;
                prod[i+j+1] = s % 10;
            }
        }

        StringBuilder res = new StringBuilder();
        for(int x : prod) {
            if(res.length() == 0 && x == 0) continue;
            res.append(x);
        }
        return res.toString();
    }
}