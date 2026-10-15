class Solution {
    public boolean threeFibonacciSum(int n) {
        long a = 0;
        long b = 1;
        long c = 1;
        while(a+b+c < n){
            a=b;
            b=c;
            c=a+b;
        }
        return a+b+c==n;
    }
}