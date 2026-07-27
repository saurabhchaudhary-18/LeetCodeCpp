class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        int odd = 0;
        for(int x : nums){
            if(x%2==0){
                even++;
            } else {
                odd++;
            }
        }
        for(int i=0; i<even; i++){
            nums[i] = 0;
        }
        for(int i=0; i<odd; i++){
            nums[i+even] = 1;
        }
        return nums;
    }
}