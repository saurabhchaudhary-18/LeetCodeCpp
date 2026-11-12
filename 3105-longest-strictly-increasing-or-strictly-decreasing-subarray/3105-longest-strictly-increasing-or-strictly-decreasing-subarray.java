class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dnc = 1;
        int max = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                inc++;
                dnc = 1;
            } else if(nums[i-1]>nums[i]){
                inc=1;
                dnc++;
            } else {
                inc=1;
                dnc=1;
            }
            max = Math.max(max,Math.max(inc,dnc));
        }
        return max;
    }
}