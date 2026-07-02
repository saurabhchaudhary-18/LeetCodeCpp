class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int ind = 0;
        for(int x : nums){
            if(ind<k||x!=nums[ind-k]){
                nums[ind++] = x;
            }
        }
        return Arrays.copyOf(nums,ind);
    }
}