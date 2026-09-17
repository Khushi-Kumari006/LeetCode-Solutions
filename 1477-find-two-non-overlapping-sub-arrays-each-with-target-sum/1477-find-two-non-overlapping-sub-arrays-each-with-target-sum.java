class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int INF = 1_000_000_000;
        int l = 0, sum = 0;
        int len = INF, ans = INF;
        int[] dp = new int[n];
        for (int r = 0; r < n; r++) {
            sum += arr[r];
            while (sum > target) {
                sum -= arr[l++];
            }
            if (sum == target) {
                int currLen = r - l + 1;
                if (l > 0 && dp[l - 1] != INF) {
                    ans = Math.min(ans, dp[l - 1] + currLen);
                }
                len = Math.min(len, currLen);
            }
            dp[r] = (r > 0) ? Math.min(dp[r - 1], len) : len;
        }
        return ans == INF ? -1 : ans;
    }
}