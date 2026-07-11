class Solution {
    public int[] rotateElements(int[] nums, int k) {
        if(k==0){
            return nums;
        }
        int size = 0;
        for(int x : nums){
            if(x>=0){
                size++;
            }
        }
        if(size==1 || size==0){
            return nums;
        }
        int[] arr = new int[size];
        int ind = 0;
        for(int x : nums){
            if(x>=0){
                arr[ind++] = x;
            }
        }
        //return arr;
        k=k%size;
        reverse(arr,0,k-1);
        reverse(arr,k,size-1);
        reverse(arr,0,size-1);
        ind =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                nums[i] = arr[ind++];
            }
        }
        return nums;
    }
    void reverse(int[] arr, int k, int n){
        while(k<n){
            int t = arr[k];
            arr[k] = arr[n];
            arr[n] = t;
            k++;
            n--;
        }
    }
}