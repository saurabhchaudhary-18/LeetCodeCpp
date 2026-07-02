class Solution {
    public int compareBitonicSums(int[] nums) {
        int max = nums[0];
        int ind = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
                ind = i;
            }
        }

        long asc = 0;
        long dsc = 0;
        for(int i=0; i<=ind; i++){
            asc = asc + nums[i];
        }
        for(int i=ind; i<nums.length; i++){
            dsc = dsc + nums[i];
        }
        System.out.println(asc+" "+dsc);
        if(asc<dsc){
            return 1;
        }else if(dsc<asc){
            return 0;
        } else {
            return -1;
        }
    }
}