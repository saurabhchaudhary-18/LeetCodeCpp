class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] count = new int[101];
        for(int x: nums) {
            count[x]++;
        }
        int[] arr = new int[nums.length];
        int ind = 0;
        while(ind < nums.length){
            for(int i=1; i<=100; i++){
                if(count[i]>0){
                    arr[ind] = i;
                    ind++;
                    count[i]--;
                }
            }
        }
        return arr;
    }
}