class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);

        }
        int i =0;
        for(int x : set){
            if(x!=i){
                return i;
            }
            i++;
        }
        return i;
    }
}