class Solution {
    public boolean uniformArray(int[] nums1) {
        int small = Integer.MAX_VALUE;
        for(int x : nums1){
            if(x%2==1){
                small = Math.min(small,x);
            }
        }
            if(small==Integer.MAX_VALUE){
                return true;
            }

        for(int x : nums1){
                if(x%2==0 && x<= small){
                    return false;
                }
        }
        return true;
    }
}