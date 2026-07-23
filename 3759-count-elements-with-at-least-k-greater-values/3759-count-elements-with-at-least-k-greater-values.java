class Solution {
    public int countElements(int[] nums, int k) {
        if(k==0){
            return nums.length;
        }
        Arrays.sort(nums);
        int min = nums[nums.length-k];
        int cnt = 0;
        for(int x : nums){
            if(x<min){
                cnt++;
            }
        }
        return cnt;
    }
}