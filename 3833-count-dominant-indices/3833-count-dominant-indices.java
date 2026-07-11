class Solution {
    public int dominantIndices(int[] nums) {
        int cnt = 0;
        for(int i=0; i<nums.length-1; i++){
            if(dominant(nums,i)){
                cnt++;
            }
        }
        return cnt;
    }
    boolean dominant(int[] arr, int a){
        int sum = 0;
        int cnt = 0;
        for(int i=a; i<arr.length; i++){
            sum = sum + arr[i];
            cnt++;
        }
        return arr[a]>sum/cnt;
    }
}