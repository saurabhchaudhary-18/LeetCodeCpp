class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max = 0;
        int curr = 0;
        int n = nums.length;
        for(int i=0; i<n-k; i++){
            curr = Math.max(curr,nums[i]);
            max = Math.max(max,curr+nums[i+k]);
        }
        return max;
    }
}