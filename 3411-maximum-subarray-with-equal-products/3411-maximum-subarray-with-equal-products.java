class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = Math.min(n, 2);
        int left = 0;
        for (int right = 0; right < n; right++) {
            for (int k = left; k < right; k++) {
                if (gcd(nums[k], nums[right]) > 1) {
                    left = k + 1;
                }
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}