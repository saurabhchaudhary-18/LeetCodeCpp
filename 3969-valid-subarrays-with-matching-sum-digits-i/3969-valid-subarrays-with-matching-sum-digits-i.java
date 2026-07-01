class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int cnt =0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            long sum = 0;

            for(int j=i; j<n; j++){
                sum = sum + nums[j];
                //System.out.println(sum);
                if(condition(sum,x)){
                    //System.out.println(sum);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    boolean condition(long sum, int x){
        String s = sum +"";
        if(s.charAt(0)-'0'!=x){
            return false;
        }
        if(s.charAt(s.length()-1)-'0'!=x){
            return false;
        }
        return true;
    }
}