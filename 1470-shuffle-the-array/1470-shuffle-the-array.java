class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int ind = 0;
        int s = 0;
        while(s!=nums.length/2){
            arr[ind++] = nums[s++];
            arr[ind++] = nums[n++];
        }
        return arr;
    }
}