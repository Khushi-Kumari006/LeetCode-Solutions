class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;   
        int close= 0;        
        for (char c : s.toCharArray()) {
        if (c == '(') {
            close++;  
        } else if (c == ')') {
            if (close > 0) {
                close--; 
            } else {
                open++;  
            }
        }
    }
    return open + close;
    }
}