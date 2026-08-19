class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int n = chalk.length;
        long sum = 0;
        int i=0;
        for(i=0;i<n;i++){
            sum+=chalk[i];
        }
        if(k>=sum){
            k = k%(int)sum;
        }
        for(i=0;i<n;i++){
            if(k<chalk[i]){
                break;
            }
            k-=chalk[i];
        }
        return i;
        
    }
}