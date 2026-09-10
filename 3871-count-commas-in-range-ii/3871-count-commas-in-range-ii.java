class Solution {
    public long countCommas(long n) {
        if(n<=999){
            return 0;
        }
        long comma = 0;
        long rangeS = 1000;
        long rangeE = rangeS *1000-1;
        int commas = 1;
        while(rangeS<=n){
            long num = Math.min(n,rangeE)-rangeS+1;
            comma += (long)commas*num;
            if(rangeE>n){
                break;
            }
            rangeS = rangeS * 1000;
            rangeE = rangeS * 1000-1;
            commas++;
        }
        return comma;
    }
}