class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0; i<arr.length; i++){
            arr[i] =  smaller(nums,i);
        }
        return  arr;
    }
    int smaller(int[] arr, int a){
        int cnt =0;
        for(int i=0; i<arr.length; i++){
            if(arr[a]>arr[i]){
                cnt++;
            }
        }
        return cnt;
    }
}