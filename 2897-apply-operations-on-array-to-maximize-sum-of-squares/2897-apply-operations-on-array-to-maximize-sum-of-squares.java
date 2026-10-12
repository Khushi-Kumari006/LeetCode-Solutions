class Solution{
    public int maxSum(List<Integer> nums, int k){
        int [] m = new int[30];
        for(int n : nums)
            for(int i=0; i<30; i++)
                m[i] += (n >> i) & 1;
        long r = 0;
        long c = 0;
        for(int i=0; i<k; i++, c=0){    
            for(int j=29; j>-1; j--)
                if (m[j]>0){
                    c |= 1L << j;
                    m[j]--;
                }
            r = (r + c*c) % 1000000007;
        }
        return (int) r;
    }
}