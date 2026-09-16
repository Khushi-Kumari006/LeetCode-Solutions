class Solution {
    public int splitArray(int[] nums, int k) {
        if(k>nums.length) return -1;
        long l = 0, h = 0;
        for (int num : nums) {
            l = Math.max(l, num);
            h += num;
        }

        while (l < h) {
            long mid = l + (h - l) / 2; // mid is subarray sub
            // System.out.println("l = " + l + " and h = " + h + "mid = "+mid);
            int curr = findCntOfSubArrays(nums, mid); // fidn no. of subarrays 
            // System.out.println("curr = " + curr);
            if (curr > k) {
                l = mid + 1;
            } else {
                h = mid;
            }
            
        }
        return (int) l;
    }

    public int findCntOfSubArrays(int[] nums, long val) {
        int i = 0, cnt = 0;
        long curr = 0;
        while (i < nums.length) {
            curr += nums[i];
            if (curr > val) {
                cnt++;
                curr = nums[i];
            } else if (curr == val) {
                cnt++;
                curr = 0;
            }
            i++;
        }
        if(curr!=0) cnt++;
        return cnt;
    }

}