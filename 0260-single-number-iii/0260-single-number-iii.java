class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> map =  new HashMap<>();
        int[] arr = new int[2];
        boolean flag = true;
        for(int x : nums){
            if(!map.containsKey(x)){
                map.put(x,1);
            } else {
                map.put(x,map.get(x)+1);
            }
        }
        for(int x : nums){
            if(map.get(x)==1 && flag==true){
                arr[0] = x;
                flag = false;
            } else if(map.get(x)==1 && flag == false){
                arr[1] = x;
            }
        }
        return arr;
    }
}