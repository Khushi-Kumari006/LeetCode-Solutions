class Solution {
    public long maximumValue(int n, int s, int m) {
        if (n == 1) return s;
        n--;
        long mCnt1 = (n + 1) / 2;
        long oneCnt1 = n - mCnt1;
        long oneCnt2 = (n + 1) / 2;
        long mCnt2 = n - oneCnt2;
        long ans1 = s + m * mCnt1 - oneCnt1;
        long ans2 = s + m * mCnt2 - oneCnt2;
        if (n % 2 == 0) {
            ans1++;
        } else {
            ans2++;
        }
        return Math.max(ans1, ans2);
    }
}