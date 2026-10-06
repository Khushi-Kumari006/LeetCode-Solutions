class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] leftsum = new int[nums.length + 1];
        int total  = 0;
        leftsum[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            leftsum[i] = leftsum[i - 1] + nums[i - 1];
            total += nums[i - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            int rightsum = total - nums[i] - leftsum[i];
            if (leftsum[i] == rightsum) {
                return i;
            }
        }
        return -1;
    }
}