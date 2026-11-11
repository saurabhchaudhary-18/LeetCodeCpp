class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        String b = nums[0]+""+nums[1];
        for(int i=0; i<nums.length-1; i++){
            String a = nums[i]+""+nums[i+1];
            if(b.length()==0){
                min = Integer.parseInt(a);
                b=a;
            }
            int c = Math.min(Integer.parseInt(a),Integer.parseInt(b));
            min = Math.min(c,min);
            b = a;
            i++;
        }
        return min;
    }
}