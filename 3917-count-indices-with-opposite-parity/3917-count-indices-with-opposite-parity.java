class Solution {
    public int[] countOppositeParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = parity(nums,i,nums[i]);
        }
        return arr;
    }
    int parity(int[] arr, int ind, int a){
        int cnt = 0;
        if(a%2==0){
            for(int i=ind; i<arr.length; i++){
                if(arr[i]%2!=0){
                    cnt++;
                }
            }
        } else {
            for(int i=ind; i<arr.length; i++){
                if(arr[i]%2==0){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}