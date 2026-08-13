class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
        /*int a = x^y;
        String s = "";
        while(a!=0){
            s=a%2+s;
            a=a/2;
        }
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                cnt++;
            }
        }
        return cnt;*/
    }
}