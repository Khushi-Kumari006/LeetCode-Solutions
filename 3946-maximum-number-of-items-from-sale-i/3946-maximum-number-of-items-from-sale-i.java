class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n=items.length;
        int max=0;
        int min=Integer.MAX_VALUE;
        for (int i[] : items) {
            max=Math.max(max,i[0]);
            min=Math.min(min,i[1]);
        }
        int count[]=new int[max+1];
        for (int i[]:items) {
            count[i[0]]++;
        }
        int val[]=new int[n];
        for (int i=0;i<n;i++) {
            int f=items[i][0];
            int total=0;
            for (int j=f;j<=max;j+=f) {
                total+=count[j];
            }
            val[i]=total; 
        }
        int dp[]=new int[budget+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for (int i=0;i<n;i++) {
            int cost=items[i][1];
            int value=val[i];
            for (int j=budget;j>=cost;j--) {
                if (dp[j-cost]!=-1) {
                    dp[j]=Math.max(dp[j],dp[j-cost]+value);
                }
            }
        }
        int maxtotal=0;
        for (int j=0;j<=budget;j++) {
            if (dp[j] != -1) {
                int extra=(budget-j)/min;
                maxtotal=Math.max(maxtotal, dp[j]+extra);
            }
        }
        return maxtotal;
    }
}