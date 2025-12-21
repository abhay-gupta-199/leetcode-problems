// Last updated: 12/21/2025, 10:44:41 PM
1class Solution {
2    public double findMedianSortedArrays(int[] a, int[] b) {
3        int n1 = a.length;
4        int n2 = b.length;
5        if(n1 > n2) return findMedianSortedArrays(b, a);
6
7        int total = n1 + n2;
8        int half = (total + 1)/2;
9        int l = 0, r = a.length;
10
11        while(l <= r) {
12            int al = l + (r-l)/2;
13            int bl = half - al;
14
15            int a_left = (al == 0) ? Integer.MIN_VALUE : a[al - 1];
16            int a_right = (al == a.length) ? Integer.MAX_VALUE : a[al];
17            int b_left = (bl == 0) ? Integer.MIN_VALUE : b[bl - 1];
18            int b_right = (bl == b.length) ? Integer.MAX_VALUE : b[bl];
19
20            if(a_left <= b_right && b_left <= a_right) {
21                if(total % 2 == 0) {
22                    return (Math.max(a_left, b_left) + Math.min(a_right, b_right))/2.0;
23                } else {
24                    return Math.max(a_left, b_left)/1.0;
25                }
26            } else if(a_left > b_right) {
27                r = al - 1;
28            } else if(b_left > a_right) {
29                l = al + 1;
30            }
31        }
32        return 0;
33    }
34}