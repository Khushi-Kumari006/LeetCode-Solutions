class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '(' ){
                stk.push(')');
            }
            else if(ch == '[' ){
                stk.push(']');
            }
            else if(ch == '{') {
                stk.push('}');
            }
            else if(!stk.empty() && stk.peek() == ch ){
                stk.pop();
            }
            else if(!stk.empty() && stk.peek() == ch ){
                stk.pop();   
            }
            else if(!stk.empty() && stk.peek() == ch ){
                stk.pop();
            }else{
                return false ;
            }
        }
        return stk.empty() ;
    }
}
     