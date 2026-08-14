class Solution {
    public int countKDifference(int[] nums, int k) {
         int[] freq = new int[101];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num - k >= 1) {
                count += freq[num - k];
            }
            if (num + k <= 100) {
                count += freq[num + k];
            }
            freq[num]++;
        }
        return count;
        
    }
}