// Last updated: 8/6/2025, 11:03:44 AM
class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<Integer> ll = new ArrayList<>();
        order(n, 0, ll);
        ll.remove(0);
        return ll;
    }
    public static void order(int n, int cur, ArrayList<Integer> ll) {
        if(cur > n) {
            return;
        }
        ll.add(cur);
        int i = 0;
        if(cur == 0) {
            i = 1;
        }
        for(; i <= 9; i++) {
            order(n, cur*10 + i, ll);
        }
    }
}