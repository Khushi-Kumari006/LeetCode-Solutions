class Solution {
    List<String>res=new ArrayList<>();
    private void backtrack(int n, int k, int sum, StringBuilder temp){
        if(sum>k) return;
        if(temp.length()==n){
            res.add(temp.toString());
            return;
        }
        int idx=temp.length();
        temp.append('0');
        backtrack(n,k,sum,temp);
        temp.deleteCharAt(temp.length()-1);
        
        if(idx==0||temp.charAt(idx-1)!='1'){
            temp.append('1');
            backtrack(n,k,sum+idx,temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> generateValidStrings(int n, int k) {
        StringBuilder temp=new StringBuilder();
        backtrack(n, k, 0, temp);
        return res;
    }
}