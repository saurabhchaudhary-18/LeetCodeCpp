class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = max;
        for(int x : nums){
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        return gcd(min,max);
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}