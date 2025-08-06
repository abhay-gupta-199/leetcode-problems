// Last updated: 8/6/2025, 11:01:41 AM
class Solution {
    public long minimumDifference(int[] nums) {
        int len = nums.length, n = len / 3, n2 = len - n;
        long[] firstMin = new long[n2 + 1];
        long[] secondMax = new long[n2 + 1];
        long firstSum = 0, secondSum = 0;

        PriorityQueue<Integer> firstMaxeap = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> secondMineap = new PriorityQueue<>();

        for(int i = 0; i < n; i++) {
            firstMaxeap.offer(nums[i]);
            firstSum += nums[i];
        } firstMin[n - 1] = firstSum;

        for(int i = n; i < n2; i++) {
            if(nums[i] < firstMaxeap.peek()) {
                firstSum += nums[i] - firstMaxeap.poll();
                firstMaxeap.offer(nums[i]);
            } firstMin[i] = firstSum;
        }

        for(int i = len - 1; i >= n2; i--) {
            secondMineap.offer(nums[i]);
            secondSum += nums[i];
        } secondMax[n2] = secondSum;

        for(int i = n2 - 1; i >= n; i--) {
            if(nums[i] > secondMineap.peek()) {
                secondSum += nums[i] - secondMineap.poll();
                secondMineap.offer(nums[i]);
            } secondMax[i] = secondSum;
        }

        long res = Long.MAX_VALUE;
        for(int i = n - 1; i < n2; i++) {
            res = Math.min(res, firstMin[i] - secondMax[i+1]);
        }
        return res;
    }
}