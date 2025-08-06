// Last updated: 8/6/2025, 11:05:26 AM
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        gen(n, 0, 0, "", ll);
        return ll;
    }
    public static void gen(int n, int oc, int cc, String s, List<String> ll) {
        if(oc == n && cc == n) {
            ll.add(s);
            return;
        } if(oc > n || cc > oc) {
            return;
        }
        gen(n, oc+1, cc, s+"(", ll);
        gen(n, oc, cc+1, s+")", ll);
    }
}