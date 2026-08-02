class Solution {
    public int countValidPrefixes(String s) {
        int cnt = 0;
        int o = 0;
        int l = 0;
        for(char ch : s.toCharArray()){
            if(ch=='0'){
                o++;
            } else {
                l++;
            }
            if(Math.abs(o-l)<=1){
                cnt++;
            }
        }
        return cnt;
    }
}