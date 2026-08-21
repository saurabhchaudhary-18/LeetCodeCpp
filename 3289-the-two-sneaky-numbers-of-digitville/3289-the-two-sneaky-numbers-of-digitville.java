class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        boolean flag = true;
        for(int x : nums){
            if(set.contains(x) && flag == true){
                arr[0] = x;
                flag = false;
            }
            if(set.contains(x)&&flag==false){
                arr[1] = x;
            }
            set.add(x);
        }
        return arr;
    }
}