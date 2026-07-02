class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = reverse(n);
        if(rev<n){
            int t = rev;
            rev = n;
            n = t;
        }
        int sum = 0;
        for(int i=n; i<=rev; i++){
            if(prime(i)){
                sum = sum + i;
            }
        }
        return sum;
    }
    int reverse(int a){
        int rev = 0;
        while(a!=0){
            rev = (rev*10) + (a%10);
            a = a/10;
        }
        return rev;
    }
    boolean prime(int a){
        if(a==1){
            return false;
        }
        if(a==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}