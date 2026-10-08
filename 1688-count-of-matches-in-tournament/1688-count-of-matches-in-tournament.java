class Solution {
    public int numberOfMatches(int n) {
        int teams=0;
        while(n>1){
            if(n%2!=0){
                teams+=(n-1)/2;
                n=(n-1)/2+1;
            }else if(n%2==0){
                teams+=n/2;
                n=n/2;
            }
            
        }
        return teams;
    }
}