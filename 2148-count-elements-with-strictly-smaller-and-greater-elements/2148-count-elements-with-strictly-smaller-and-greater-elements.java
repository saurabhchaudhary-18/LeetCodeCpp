class Solution {
    public int countElements(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int x : nums){
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
        }
        int mincount = 0;
        int maxcount = 0;
        for(int x : nums){
            if(max==x){
                maxcount++;
            }
            if(min==x){
                mincount++;
            }
        }
        if(maxcount+mincount==2*nums.length){
            return 0;
        }
        return nums.length-(mincount+maxcount);
    }
}