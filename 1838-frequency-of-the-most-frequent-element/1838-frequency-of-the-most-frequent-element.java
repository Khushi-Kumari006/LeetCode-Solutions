class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0;
        long t= 0;
        int mf = 0;
        for (int r = 0; r < nums.length; r++) {
            t += nums[r];
            while ((long) nums[r] * (r - l + 1) - t > k) {
                t -= nums[l];
                l++;
            }
            mf = Math.max(mf, r - l + 1);
        }
        return mf;
    }
}