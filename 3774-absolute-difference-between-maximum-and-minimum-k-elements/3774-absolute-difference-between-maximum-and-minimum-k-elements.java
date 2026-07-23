class Solution {
    public int absDifference(int[] nums, int k) {
        int l=0;
        int s=0;
        Arrays.sort(nums);
        for(int i=0; i<k; i++){
            s=s+nums[i];
        }
        
        int n = nums.length-1;
        while(k-->0){
            l=l+nums[n--];
        }
        return l-s;
    }
}