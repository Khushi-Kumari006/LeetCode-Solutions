class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            int m = left + (right - left) / 2;
            if (m != i && nums[i] == nums[m]) {
                return false;
            }
        }
        return true;
    }
}