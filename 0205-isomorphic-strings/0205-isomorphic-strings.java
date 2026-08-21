class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> map  = new HashMap<>();
        HashMap<Character, Character> mapp = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            char chh = t.charAt(i);
            if(map.containsKey(ch)){
                if(map.get(ch) != chh){
                    return false;
                }
            }else{
                map.put(ch, chh);
            }
            if(mapp.containsKey(chh)){
                if(mapp.get(chh) != ch){
                    return false;
                }
            }else{
                mapp.put(chh, ch);
            }
        }
        return true;
    }
}