class Solution {
    public int minOperations(String s) {
        if(s.length() == 2){
            if(s.charAt(0) <= s.charAt(1)) return 0;
            return -1;
        }
        if(s.length() == 1) return 0;
        char sChar = s.charAt(0);
        char bChar = s.charAt(0);
        boolean isSorted = true;
        char prevValue = s.charAt(0);
        for(int i = 0; i < s.length(); i++){
            if(isSorted){
                if(!(s.charAt(i) >= prevValue)){
                    isSorted = false;
                } 
                prevValue = s.charAt(i);
            }
            if(s.charAt(i) > bChar) bChar = s.charAt(i);
            if(s.charAt(i) < sChar) sChar = s.charAt(i);
        }
        if(isSorted) return 0;
        if(s.charAt(s.length() - 1) == sChar && s.charAt(0) == bChar){
            int minCount = 0;
            int maxCount = 0;
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == sChar) minCount++;
                if(s.charAt(i) == bChar) maxCount++;
            }
            if(minCount > 1 || maxCount > 1) return 2;
            return 3;
        }
        if(s.charAt(0) == sChar || s.charAt(s.length() - 1) == bChar) return 1;
        return 2;
    }
}