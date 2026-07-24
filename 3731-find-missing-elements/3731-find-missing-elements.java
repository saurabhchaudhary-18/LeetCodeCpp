class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int counter = nums[0];
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=counter){
                result.add(counter);
                i=i-1;
            }
            counter++;
        }
        return result;
    }
}