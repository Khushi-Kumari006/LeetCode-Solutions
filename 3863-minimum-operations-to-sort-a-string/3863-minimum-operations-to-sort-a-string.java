class Solution {
    public int minOperations(String s) {
        int len = s.length();
        if(len <= 1) return 0;
        char minc = 'z';
        char maxc = 'a';
        boolean isSorted = true;
        for(int it = 0; it < len; it++) {
            char ch = s.charAt(it);
            if(it > 0 && s.charAt(it) < s.charAt(it - 1)) isSorted = false;
            if(ch < minc) minc = ch;
            if(ch > maxc) maxc = ch;
        }
        if(isSorted) return 0;
        if(len == 2) return -1;
        if(s.charAt(0) == minc || s.charAt(len-1) == maxc) return 1;
        if(s.charAt(0) == maxc && s.charAt(len-1) == minc) {
            boolean b1 = true;
            boolean b2 = true;
            for(int i = 1; i < len; i++) {
                if(s.charAt(i) == maxc) b1 = false;
            }
            for(int i = 0; i < len - 1; i++) {
                if(s.charAt(i) == minc) b2 = false;
            }
            if(b1 && b2) return 3;
        }
        return 2;
    }
}