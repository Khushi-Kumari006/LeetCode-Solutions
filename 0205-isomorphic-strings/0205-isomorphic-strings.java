class Solution {
    public boolean isIsomorphic(String s, String t) {
        int i1[]=new int[200];
        int i2[]=new int[200];
        if(s.length()!=t.length())
            return false;
            for(int i=0;i<s.length();i++){
            if(i1[s.charAt(i)]!=i2[t.charAt(i)])
                return false;
            i1[s.charAt(i)]=i+1;
            i2[t.charAt(i)]=i+1;
        }
        return true;
    }
}