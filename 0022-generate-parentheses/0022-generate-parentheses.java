class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        back(0,0,"",n,result);
        return result;
    }
    public void back(int open, int close, String s, int n, List<String> result){
        if(open == close && open==n){
            result.add(s);
            return;
        }
        if(open<n){
            back(open+1,close,s+"(",n,result);
        }
        if(close<open){
            back(open,close+1,s+")",n,result);
        }
    }
}