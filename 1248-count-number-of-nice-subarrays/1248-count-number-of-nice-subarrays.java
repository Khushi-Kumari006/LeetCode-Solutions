class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       return atMost(nums,k)-atMost(nums,k-1);
    }
public int atMost(int[] nums, int k){
        int l=0;
        int r=0;
        int oc=0;
        int sac=0;
        while(r<nums.length){
            if(nums[r]%2==1){
                oc++;
            }
            while(oc>k){
                if(nums[l]%2==1){
                    oc--;
                }
                l++;
            }
            if(oc<=k){
                sac+=r-l+1;
            }
            r++;
        }
        return sac;
    }
}