class Solution {
    public int minLights(int[] lights) {
        int ans = 0, cnt = 0;
        int n = lights.length;
        int[] illuminate = new int[n+1];
        for(int i = 0; i < n; i++) {
            int range = lights[i];
            if(range > 0) {
                int l = Math.max(0, i-range);
                int r = Math.min(n-1, i+range);
                illuminate[l] += 1;
                illuminate[r+1] -= 1;
            }
        }
        int len = 0;
        for(int i = 0; i < n; i++) {
            cnt += illuminate[i];
            if(cnt == 0) len += 1;
            else {
                if(len > 0) {
                    ans += (len+2)/3;
                    len = 0;
                }
            }
        }
        if(len > 0) ans += (len+2)/3;
        return ans;
    }
}