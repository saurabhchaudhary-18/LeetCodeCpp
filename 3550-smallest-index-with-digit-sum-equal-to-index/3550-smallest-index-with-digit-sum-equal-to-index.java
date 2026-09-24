class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(sum(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
    public static int sum(int a){
        int sum = 0;
        while(a!=0){
            sum = sum + (a%10);
            a=a/10;
        }
        return sum;
    }
}