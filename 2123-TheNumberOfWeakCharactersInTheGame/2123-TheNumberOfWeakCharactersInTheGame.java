// Last updated: 8/6/2025, 11:02:01 AM
class Solution {
    public int numberOfWeakCharacters(int[][] props) {
        int n = props.length;
        int res = 0;

        // Arrays.sort(props, (a, b) -> a[0] - b[0]);
        // for(int i = 0; i < n-1; i++) {
        //     for(int j = i+1; j < n; j++) {
        //         if(props[i][0] < props[j][0] && props[i][1] < props[j][1]) {
        //             res++;
        //             break;
        //         }
        //     }
        // }

        Arrays.sort(props, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : b[0] - a[0]);

        int max = 0;
        for(var p : props) {
            if(p[1] < max) res++;
            max = p[1] > max ? p[1] : max;
        }
        return res;
    }
}