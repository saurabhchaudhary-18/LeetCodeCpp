class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] arr = new int[101];
        for(int x : nums){
            arr[x-1]++;
        }
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            int x = nums[i];
            if(arr[x-1]!=3){
                continue;
            }
            arr[x-1] = -1;
            for(int d = 1; i+(d*2)<nums.length; d++){
                if(nums[i+d]==x && nums[i+(d*2)]==x){
                    cnt++;
                    break;
                }
            }
        }
        return cnt;
    }
}