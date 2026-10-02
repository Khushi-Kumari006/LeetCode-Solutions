class Solution {
    public int rotatedDigits(int n) {
        int ans =  0; 
        for(int i = 2 ; i<= n ;i++){
            boolean isGood = false;
            int m = i;
            while(m>0){
                int ld = m%10;
                m = m/10;
                if(ld == 2 || ld == 5 || ld == 6 || ld == 9) isGood = true;
                else if(ld == 3 || ld == 4 || ld == 7){
                    isGood = false;
                    break; 
                }
            }
            if(isGood) ans++;
        }

        return ans;
    }
}