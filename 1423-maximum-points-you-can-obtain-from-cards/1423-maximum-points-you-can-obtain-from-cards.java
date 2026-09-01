class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int t = 0;
        for (int i = 0; i < k; i++) t += cardPoints[i];
        int b = t;
        for (int i = k - 1, j = cardPoints.length - 1; i >= 0; i--, j--) {
            t += cardPoints[j] - cardPoints[i];
            b = Math.max(b, t);
        }
        return b;
        
    }
}