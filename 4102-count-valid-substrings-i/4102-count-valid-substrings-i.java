class Solution {
    public long countValidSubstrings(String s) {
        String[] part = s.replace("abc", "ab bc").split(" ");
        long res = -(part.length-1);
        for(String p : part){
            long a = p.length();
            res = res + a*(a+1)/2;
        }
        return res;
    }
}