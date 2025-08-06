// Last updated: 8/6/2025, 11:02:33 AM
class Solution {
    public String rankTeams(String[] votes) {
        int n = votes.length;
        String sample = votes[0];
        if(n == 1) return sample;

        int l = sample.length();
        Character[] teams = new Character[l];
        for(int i = 0; i < l; i++) {
            teams[i] = sample.charAt(i);
        }

        int[][] ranks = new int[26][l];
        for(String s : votes) {
            for(int i = 0; i < l; i++) {
                ranks[s.charAt(i) - 'A'][i]++;
            }
        }

        Arrays.sort(teams, (a, b) -> {
            for(int k = 0; k < l; k++) {
                if(ranks[a - 'A'][k] != ranks[b - 'A'][k]) {
                    return ranks[b - 'A'][k] - ranks[a - 'A'][k];
                }
            }
            return a - b;
        });

        StringBuilder res = new StringBuilder();
        for(char ch : teams) {
            res.append(ch);
        }
        return res.toString();
    }
}