class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean zero = false;
        for(int x : nums){
            xor=xor^x;
            if(x!=0){
                zero = true;
            }
        }
        if(xor!=0){
            return nums.length;
        }
        if(!zero){
            return 0;
        }
        return nums.length-1;
    }
}