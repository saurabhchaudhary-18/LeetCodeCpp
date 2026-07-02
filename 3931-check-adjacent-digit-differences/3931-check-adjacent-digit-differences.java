class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0; i<s.length()-1; i++){
            if(abs(s.charAt(i)-'0',s.charAt(i+1)-'0')>2){
                return false;
            }
        }
        return true;
    }
    int abs(int a, int b){
        if(a>b){
            return a-b;
        } else {
            return b-a;
        }
    }
}