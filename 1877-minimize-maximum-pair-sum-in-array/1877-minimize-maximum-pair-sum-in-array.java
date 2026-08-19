class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int ms = 0, l = 0, r = nums.length - 1;
        while(l < r) {
            ms = Math.max(ms, nums[l++] + nums[r--]);
        }
        return ms;
        
    }
}