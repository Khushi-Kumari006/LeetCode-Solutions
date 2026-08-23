class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
         int[] dp = new int[text1.length()];
         int lg =0;
         for(char c: text2.toCharArray()){
            int cl =0;
            for(int i=0;i<dp.length;i++){
                if(cl<dp[i]){
                    cl =dp[i];
                }else if(c==text1.charAt(i)){
                    dp[i]= cl+1;
                    lg = Math.max(lg,cl+1);
                }
            }
         } 
        return lg;
    }
}