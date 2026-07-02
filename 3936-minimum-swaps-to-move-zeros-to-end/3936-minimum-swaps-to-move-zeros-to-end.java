class Solution {
    public int minimumSwaps(int[] nums) {
        int high = nums.length-1;
        int low = 0;
        int swap = 0;
        while(low<high){
            if(nums[low]==0 && nums[high]!=0){
                swap++;
                low++;
                high--;
            } else if(nums[low]==0 && nums[high]==0){
                high--;
                continue;
            } else if(nums[low]!=0 && nums[high]!=0){
                low++;
                continue;
            } else {
                high--;
                low++;
            }
        }
        return swap;
    }
}