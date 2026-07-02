class Solution {
    public List<Integer> findValidElements(int[] nums) {
        
        List<Integer> res = new ArrayList<>();
        if(nums.length==1){
            res.add(nums[0]);
            return res;
        }
        res.add(nums[0]);
        for(int i=1; i<nums.length-1; i++){
            if(inc(nums,i) || dec(nums,i)){
                res.add(nums[i]);
            }
        }
        res.add(nums[nums.length-1]);
        return res;
    }
    boolean inc(int[] arr, int a){
        for(int i=0; i<a; i++){
            if(arr[i]>=arr[a]){
                return false;
            }
        }
        return true;
    }
    boolean dec(int[] arr, int a){
        for(int i=a+1; i<arr.length; i++){
            if(arr[a]<=arr[i]){
                return false;
            }
        }
        return true;
    }
}