class Solution {
    public boolean isUgly(int n) {
        int i=2;
        while(i<6 && n>0){
            while(n%i==0){
                n=n/i;
            }
            i++;
        }
        return n==1;
    }
}