class Solution {
    public long sumAndMultiply(int n) {
        long ans = 0;
        int sum = sum(n);
        while(n!=0){
            if(n%10==0){
                n=n/10;
                continue;
            }
            ans = ans*10+n%10;
            n=n/10;
        }
        ans = rev(ans);
        ans = ans * sum;
        return ans;
    }
    long rev(long a){
        long sum = 0;
        while(a!=0){
            sum = sum * 10 + a%10;
            a=a/10;
        }
        return sum;
    }
    int sum(int a){
        int sum = 0;
        while(a!=0){
            sum = sum + a%10;
            a=a/10;
        }
        return sum;
    }

}