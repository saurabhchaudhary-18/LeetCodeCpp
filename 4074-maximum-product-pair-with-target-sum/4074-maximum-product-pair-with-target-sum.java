class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int[] arr = {-1,-1};
        int pro = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]+nums[j]==target && pro<nums[i]*nums[j] && nums[j]<nums[i]){
                    pro = nums[i]*nums[j];
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}