class Solution {
    public String alphabetBoardPath(String target) {
        int n = target.length();
        int cr=0,cc=0;
        String ans="";
        for(char ch : target.toCharArray()) {
                int t = ch-97;
                int r = t/5;
                int c = t%5;
                if(cr!=5){
                while(true){
                        if(r-cr==0 && c-cc==0)break;
                        if(c-cc > 0){
                            ans+='R';
                            cc+=1;
                        }
                        else if(c-cc < 0){
                            ans+='L';
                            cc-=1;
                        }
                        else if(r-cr > 0){
                            ans+='D';
                            cr+=1;
                        }
                        else if(r-cr < 0){
                            ans+='U';
                            cr-=1;
                        }
                    }
                }
                else{
                while(true){
                        if(r-cr==0 && c-cc==0)break;
                        if(r-cr > 0){
                            ans+='D';
                            cr+=1;
                        }
                        else if(r-cr < 0){
                            ans+='U';
                            cr-=1;
                        }
                        else if(c-cc > 0){
                            ans+='R';
                            cc+=1;
                        }
                        else if(c-cc < 0){
                            ans+='L';
                            cc-=1;
                        }
                    }
                }
                ans+='!';
            }
        return ans;
    }
}