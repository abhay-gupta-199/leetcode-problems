// Last updated: 8/6/2025, 11:01:48 AM
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] hash = new int[10];
        for(int val : digits) hash[val]++;

        List<Integer> l = new ArrayList<>();
        for(int i = 1; i < 10; i++) {
            if(hash[i] == 0) continue;
            hash[i]--;
            for(int j = 0; j < 10; j++) {
                if(hash[j] == 0) continue;
                hash[j]--;
                for(int k = 0; k < 9; k += 2) {
                    if(hash[k] == 0) continue;
                    hash[k]--;
                    l.add(i*100 + j*10 + k);
                    hash[k]++;
                }
                hash[j]++;
            }
            hash[i]++;
        }
        // return l.stream().mapToInt(Integer::intValue).toArray();
        int[] ans = new int[l.size()];
        int i = 0;
        for(int x : l) {
            ans[i++] = x;
        }
        return ans;
    }
}