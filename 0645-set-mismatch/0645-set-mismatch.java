class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr =  new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)){
                arr[0] = x;
            }
            set.add(x);
        }
        int i =1;
        for(int x : set){
            if(x!=i){
                arr[1] = i;
                break;
            }
            i++;
        }
        if(arr[1]==0){
            arr[1] = nums.length;
        }
        return arr;
    }
}