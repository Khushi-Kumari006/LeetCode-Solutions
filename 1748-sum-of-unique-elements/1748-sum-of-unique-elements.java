class Solution {
    int count(int a,int []n){
        int i,l,c=0;
        l=n.length;
        for(i=0;i<l;i++){
            if (a==n[i])
            ++c;
        }
        return c;
    }
    public int sumOfUnique(int[] nums) {
        int i,l,s=0;
        l=nums.length;
        for( i= 0 ; i < l ; i ++){
            if (count(nums[i],nums)==1)
            s+=nums[i];
        }
        return s;
    }
}