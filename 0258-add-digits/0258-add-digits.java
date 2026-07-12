class Solution {
    public int addDigits(int num) {
        return sum(num);
    }
    public static int sum(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
            n=n/10;
            sum =sum + digit;
        }
        if(sum<=9){
            return sum;
        }
        return sum(sum);
    }
}