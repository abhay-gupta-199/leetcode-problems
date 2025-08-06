// Last updated: 8/6/2025, 11:03:09 AM
class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        char[] ch = dominoes.toCharArray();
        int[] forces = new int[n];

        // Forces R from the left direction 
        int force = 0;
        for(int i = 0; i < n; i++) {
            if(ch[i] == 'R') {
                force = n;
            } else if(ch[i] == 'L') {
                force = 0;
            } else {
                force = force > 0 ? force - 1 : 0;
            }
            forces[i] += force;
        }

        // Forces L from the right direction  
        force = 0;
        for(int i = n-1; i >= 0; i--) {
            if(ch[i] == 'L') {
                force = n;
            } else if(ch[i] == 'R') {
                force = 0;
            } else {
                force = force > 0 ? force - 1 : 0;
            }
            forces[i] -= force;
        }
        

        // Building resultant string
        StringBuilder res = new StringBuilder();
        for(int x : forces) {
            if(x > 0) {
                res.append('R');
            } else if(x < 0) {
                res.append('L');
            } else {
                res.append('.');
            }
        }
        return res.toString();
    }
}