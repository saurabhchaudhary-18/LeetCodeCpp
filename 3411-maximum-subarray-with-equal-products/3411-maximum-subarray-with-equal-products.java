class Solution {
    public int maxLength(int[] nums) {
        int len = 0;
        int base = 2;
        int pro = 1;
        int n = nums.length;
        for(int i=0; i<n; i++){
            int x = nums[i];
            while(gcd(pro,x)>1){
                pro = pro/nums[len++];
            }
            pro = pro*x;
            base = Math.max(base,i-len+1);
        }
        return base;
    }
    private int gcd(int a, int b){
        if(b==0){
            return a; 
        } else {
            return gcd(b,a%b);
        }
    }
}