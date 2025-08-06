// Last updated: 8/6/2025, 11:01:22 AM
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i = 0, j = 0, res = 0;
        int m = players.length, n = trainers.length;

        while(i < m && j < n) {
            if(players[i] <= trainers[j]) {
                res++;
                i++;
            }
            j++;
        }

        return res;
    }
}