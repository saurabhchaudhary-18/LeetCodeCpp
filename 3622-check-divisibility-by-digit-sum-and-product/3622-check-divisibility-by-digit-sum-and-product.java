class Solution {
    public boolean checkDivisibility(int n) {
        int sum = sum(n);
        int pro = pro(n);
        System.out.println(sum + " "+pro);
        sum = sum + pro;
        return n%sum==0;
    }
    public static int sum(int a){
        int ans = 0;
        while(a!=0){
            ans = ans+a%10;
            a=a/10;
        }
        return ans;
    }
    public static int pro(int a){
        int ans = 1;
        while(a!=0){
            int digit = a%10;
            ans = ans*digit;
            a=a/10;
        }
        return ans;
    }
}