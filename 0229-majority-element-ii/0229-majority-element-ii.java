class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int x : nums){
            if(!map.containsKey(x)){
                map.put(x,1);
            } else {
                map.put(x,map.get(x)+1);
            }
        }
        for(int x: nums){
            if(map.get(x)>nums.length/3 && !result.contains(x)){
                result.add(x);
            }
        }
        return result;
    }
}