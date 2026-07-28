class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long ans = n;
        long b = 1;
        while(sum(n)>target){
            n=n/10+1;
            b=b*10;
        }
        return n*b-ans;
    }
    int sum(long a){
        int sum = 0;
        while(a>0){
            sum += a%10;
            a=a/10;
        }
        return sum;
    }
}