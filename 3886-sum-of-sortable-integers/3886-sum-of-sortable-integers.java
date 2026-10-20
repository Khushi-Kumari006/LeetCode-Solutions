class Solution {
    public boolean check(int[] nums, int k) {
        int n = nums.length;
        int prev_max = 0;
        for (int i = 0; i < n; i += k) {
            if (nums[i] < prev_max) return false;
            int maxx = nums[i];
            boolean point = false;
            for (int j = i + 1; j < i + k; j++) {
                if (nums[j] < prev_max) return false;
                if (nums[j - 1] > nums[j]) {
                    if (point) return false;
                    point = true;
                }
                maxx = Math.max(maxx, nums[j]);
            }
            if (point && nums[i] < nums[i + k - 1]) {
                return false;
            }
            prev_max = maxx;
        }
        return true;
    }
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int k = 1; k <= n; k++) {
            if (n % k == 0 && check(nums, k)) {
                ans += k;
            }
        }
        return ans;
    }
}