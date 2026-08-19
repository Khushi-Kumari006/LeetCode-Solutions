class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > high) {
                high = nums[i];
            }
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % mid == 0) {
                    sum += nums[i] / mid;
                } else {
                    sum += nums[i] / mid + 1;
                }
            }
            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
        