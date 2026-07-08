class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1){
            return true;
        }
        int n = nums.length;
        int t = nums[n/2];
        int cnt = 0;
        for(int x : nums){
            if(x==t){
                cnt++;
                if(cnt==2){
                    return false;
                }
            }
        }
        return true;
    }
}