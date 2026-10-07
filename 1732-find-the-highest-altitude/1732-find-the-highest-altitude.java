class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length,idx=0,max=0;
        int[]arr=new int[n+1];
        arr[idx++]=0;
        for(int val:gain){
            arr[idx]=arr[idx-1]+val;
            if(arr[idx]>max){
                max=arr[idx];
            }
            idx++;
        }
        return max;
    }
}