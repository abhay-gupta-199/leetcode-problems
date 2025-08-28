// Last updated: 8/28/2025, 12:03:45 PM
class Solution {
    public int minSensors(int n, int m, int k) {
        int range = k * 2 + 1;
        int n_covered = (n + range - 1) / range;
        int m_covered = (m + range - 1) / range;

        return n_covered * m_covered;
    }
}