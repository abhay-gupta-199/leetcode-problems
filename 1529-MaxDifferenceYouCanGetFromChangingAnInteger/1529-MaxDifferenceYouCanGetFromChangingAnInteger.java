// Last updated: 8/6/2025, 11:02:29 AM
class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        int n = s.length();
        char max = 9, min = 1;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) != '9') {
                max = s.charAt(i);
                break;
            }
        }

        if(s.charAt(0) != '1') min = s.charAt(0);
        else {
            for(int i = 1; i < n; i++) {
                if(s.charAt(i) != '0' && s.charAt(i) != '1') {
                    min = s.charAt(i);
                    break;
                }
            }
        }

        int a = 0, b = 0;
        int y = s.charAt(0) == min ? 1 : 0;

        for(char ch : s.toCharArray()) {
            if(ch == max) a = a * 10 + 9;
            else a = a * 10 + (ch - 48);

            if(ch == min) b = b * 10 + y;
            else b = b * 10 + (ch - 48);
        }

        return a - b;
    }
}