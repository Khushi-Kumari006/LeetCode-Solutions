class Solution {
    public int[] divisibilityArray(String word, int m) {
         int n = word.length();
        int[] res = new int[n];
        long remainder = 0;
        for (int i = 0; i < n; i++) {
            int digit = word.charAt(i) - '0';
            remainder = (remainder * 10 + digit) % m;
            res[i] = (remainder == 0) ? 1 : 0;
        }
        return res;
    }
}