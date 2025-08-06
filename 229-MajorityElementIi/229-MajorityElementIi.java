// Last updated: 8/6/2025, 11:04:10 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int x1 = 0, x2 = 0;
        int c1 = 0, c2 = 0;

        for(int x : nums) {
            if(x == x1) {
                c1++;
                continue;
            }
            if(x == x2) {
                c2++;
                continue;
            }
            if(c1 == 0) {
                x1 = x;
                c1++;
                continue;
            }
            if(c2 == 0) {
                x2 = x;
                c2++;
                continue;
            }
            c1--;
            c2--;
        }

        c1 = 0;
        c2 = 0;
        for(int x : nums) {
            if(x == x1) c1++;
            else if(x == x2) c2++;
        }
        
        List<Integer> res = new ArrayList<>();
        int min = nums.length / 3;

        if(c1 > min) res.add(x1);
        if(c2 > min) res.add(x2);

        return res;
    }
}