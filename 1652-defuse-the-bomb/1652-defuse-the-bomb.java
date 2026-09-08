class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] arr=new int[n];
        int sum=0;
        int count=0;
        if(k==0){
            Arrays.fill(arr,0);
        }
        else if(k>0){
            for(int i=0;i<n;i++){
                int j=i+1;
                while(count!=k){
                    if(j==n){
                        j=0;
                    }
                    sum+=code[j];
                    count++; 
                    j++;
                }
                arr[i]=sum;
                sum=0;
                count=0;
            }
        }
        else{
            k=k*-1;
            for(int i=0;i<n;i++){
                int j=i-1;
                if(i==0){
                    j=n-1;
                }
                while(count!=k){
                    if(j<0){
                        j=n-1;
                    }
                    sum+=code[j];
                    count++;
                    j--;
                }
                arr[i]=sum;
                sum=0;
                count=0;
            }
        }
        return arr;
    }
}