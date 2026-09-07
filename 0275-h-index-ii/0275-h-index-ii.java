class Solution {
    public int hIndex(int[] citations) {
        int start=1;
        int n=citations.length;
        int end=n;
        while(start<=end){
            int h=start+(end-start)/2;
            int idx=lowerB(citations,h);
            int ans=n-idx;
            if(ans>=h){
                start=h+1;
            }else{
                end=h-1;
            }
        }
        return end;
    }
    private int lowerB(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>=target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
}