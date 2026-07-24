class Solution {
    public int minimumDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    for(int k=j+1; k<nums.length; k++){
                        int d = (j-i)+(k-j)+(k-i);
                        if(nums[j]==nums[k]&&min>d){
                            min = d;
                        }
                    }
                }
            }
            
        }
        if(min==Integer.MAX_VALUE){
                return -1;
            } else {
                return min;
            }
    }
}