class Solution {
    public int countDigitOne(int n) {
        int count =0;
        int m=1;
        int r=1;
        while(n>0){
            count = count+(n+8)/10*m + (n%10 ==1 ? r:0);
            r=r+n%10 *m;
            m=m*10;
            n=n/10;
        }
        return count;
    }
}