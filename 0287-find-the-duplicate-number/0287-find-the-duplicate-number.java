class Solution {
    public int findDuplicate(int[] nums) {
        int[] freq = new int[nums.length+1];
        for(int x : nums){
            if(freq[x]==1){
                return x;
            }
            freq[x]++;
        }
        return 0;
    }
}