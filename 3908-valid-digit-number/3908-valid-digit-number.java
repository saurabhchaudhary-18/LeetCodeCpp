class Solution {
    public boolean validDigit(int n, int x) {
        if(n<10){
            return false;
        }
        String s =n+"";
        int cnt = 0;
        while(n!=0){
            if(n%10 == x){
                cnt++;
            }
            n=n/10;
        }
        return cnt>=1 && s.charAt(0)-'0'!=x;
    }
}