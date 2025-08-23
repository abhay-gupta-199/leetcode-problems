class Solution {
    public String multiply(String a, String b) {
        if(a.equals("0") || b.equals("0")) return "0";
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < a.length(); i++) {
            int x = a.charAt(i) - '0';
            int z = 0;
            StringBuilder pro = new StringBuilder();
            for(int j = b.length()-1; j >= 0; j--) {
                int y = b.charAt(j) - '0';
                int p = x * y + z;
                int d = p % 10;
                z = p / 10;
                pro.insert(0, d);
            }
            if(z != 0) pro.insert(0, z);
            if(res.length() == 0) res.append(pro);
            else {
                z = 0;
                res.append(0);
                for(int k = 1; k <= pro.length(); k++) {
                    int c1 = res.charAt(res.length() - k) - '0';
                    int c2 = pro.charAt(pro.length() - k) - '0';
                    int p = c1 + c2 + z;
                    int d = p % 10;
                    z = p / 10;
                    res.setCharAt(res.length() - k, (char) (d + '0'));
                }
                for(int k = pro.length()+1; k <= res.length(); k++) {
                    if(z == 0) break;
                    int c1 = res.charAt(res.length() - k) - '0';
                    int p = c1 + z;
                    int d = p % 10;
                    z = p / 10;
                    res.setCharAt(res.length() - k, (char) (d + '0'));
                }
                if(z != 0) res.insert(0, z);
            }
        }
        for(int i = 0; i < res.length(); i++) {
            int ch = res.charAt(i) - '0';
            if(ch != 0) {
                res.delete(0, i);
                break;
            }
        }
        return res.toString();
    }
}