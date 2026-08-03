class Solution {
    public long maxPairStrength(int[] nums) {
        long ans = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                long a = (long)nums[i]*(long)nums[j];
                long b = (long)Math.pow(gcd(nums[i],nums[j]),2);
                ans = Math.max(ans,a/b);
            }
        }
        return ans;
    }
    public static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}