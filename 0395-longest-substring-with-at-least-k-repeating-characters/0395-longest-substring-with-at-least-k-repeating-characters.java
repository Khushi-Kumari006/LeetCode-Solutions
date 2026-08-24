class Solution {
    private int helper(char[] ch, int st, int en, int k){
        if(st > en) return 0;
        int map[] = new int[26];
        for(int i = st; i <= en; i++)
            map[ch[i] - 'a']++;
            boolean flag = false;
        for(int i: map) if(i != 0 && i < k) flag = true;
        if(!flag) return en - st + 1;
        int ans = 0;
        for(int i = st, j = st, n = en + 1; j <= n; j++){
            if(j == n || map[ch[j] - 'a'] < k){
                ans = Math.max(ans, helper(ch, i, j - 1, k));
                i = j + 1;
            }
        }
        return ans;
    }
    public int longestSubstring(String s, int k) {
        return helper(s.toCharArray(), 0, s.length() - 1, k);
    }
}