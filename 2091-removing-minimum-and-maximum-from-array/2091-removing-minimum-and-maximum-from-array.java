class Solution {
    public int minimumDeletions(int[] nums) {
        int left = 0;
        int right = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[left]){
                left = i;
            }
            if(nums[i]>nums[right]){
                right = i;
            }

        }
        if(left<right){
            left = left^right;
            right = left^right;
            left = left^right;
        }
        int ans =nums.length;
        for(int i=0; i<=nums.length; i++){
            int e = 0;
            if(right>=i){
                e=nums.length-right;
            } else if(left>=i){
                e=nums.length-left;
            }
            ans = Math.min(ans,i+e);
        }
        return ans;
    }
}