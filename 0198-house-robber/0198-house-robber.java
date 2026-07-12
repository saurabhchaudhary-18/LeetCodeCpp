class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Integer.max(nums[0], nums[1]);
        }
        int[] arr =new int[nums.length];
        arr[0] = nums[0];
        arr[1] =  Integer.max(nums[1], nums[0]);
        for(int i=2; i<nums.length; i++){
            arr[i] = Integer.max(nums[i] + arr[i-2], arr[i-1]);
        }
        return arr[arr.length-1];
    }
}