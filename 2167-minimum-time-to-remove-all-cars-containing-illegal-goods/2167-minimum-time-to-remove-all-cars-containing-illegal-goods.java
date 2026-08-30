class Solution {
    private int[][] dp;
    private int minTime(String s, int idx, int stage) {
        if (idx == s.length()) return 0;
        else if(dp[idx][stage] != -1)   return dp[idx][stage];
        int requiredTime = Integer.MAX_VALUE;
        char curr = s.charAt(idx);
        for (int i = stage; i < 3; i++) {
            int temp = Integer.MAX_VALUE;
            if (i == 0 ||  i == 2) {
                temp = 1 + minTime(s, idx + 1, i);
            } else if (i == 1) {
                if (curr == '1') {
                    temp = 2 + minTime(s, idx + 1, i);
                } else {
                    temp = minTime(s, idx + 1, i);
                }
            } 
            requiredTime = Math.min(requiredTime, temp);
        }
        return dp[idx][stage] = requiredTime;
    }
    public int minimumTime(String s) {
        int n = s.length()+1;
        dp = new int[n][3];
        for(int[] dpArr : dp)   Arrays.fill(dpArr,-1);
        return minTime(s,0,0);
    }
}