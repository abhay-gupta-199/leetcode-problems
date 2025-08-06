// Last updated: 8/6/2025, 11:00:32 AM
class Solution {
    public char kthCharacter(long k, int[] operations) {
        int sft = 0;
        List<Long> lens = new ArrayList<>();
        long l = 1;
        for(int x : operations) {
            l *= 2;
            lens.add(l);
            if(l >= k) break;
        }
        for(int i = lens.size() - 1; i >= 0; i--) {
            long mid = lens.get(i) / 2;
            int x = operations[i];
            if(k > mid) {
                k -= mid;
                if(x == 1) sft++;
            }
        }
        return (char) ((sft % 26) + 'a');
    }
}