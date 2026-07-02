class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] arr = new int[nums.length*2];
        int ind = 0;
        for(int i=0; i<nums.length; i++){
            arr[ind++] = nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            arr[ind++] = nums[i];
        }
        return arr;
    }
    void reverse(int[] arr){
        int l = 0;
        int h = arr.length-1;
        while(l<=h){
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
            h--;
            l++;
        }
    }
}