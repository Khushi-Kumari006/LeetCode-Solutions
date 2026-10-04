class Solution {
    public long minEnergy(int n, int brightness, int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        long cov = 0;
        long l = intervals[0][0];
        long r = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] > r) {
                cov += r - l + 1;
                l = intervals[i][0];
                r = intervals[i][1];
            } else {
                r = Math.max(r, intervals[i][1]);
            }
        }
        cov += r - l + 1;
        return cov * ((brightness + 2L) / 3);
    }
}