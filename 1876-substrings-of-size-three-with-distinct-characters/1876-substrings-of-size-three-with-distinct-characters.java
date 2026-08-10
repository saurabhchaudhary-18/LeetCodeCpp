class Solution {
    public int countGoodSubstrings(String s) {
        int cnt = 0;
        for(int i=0; i<s.length()-2; i++){
            if(good(s.substring(i,i+3))){
                cnt++;
                System.out.println(s.substring(i,i+3));
            }
        }
        return cnt;
    }
    private static boolean good(String str){
        if(str.charAt(0)==str.charAt(1) || str.charAt(0)==str.charAt(2)){
            return false;
        }
        if(str.charAt(1)==str.charAt(2)){
            return false;
        }
        return true;
    }
}