class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            cnt = cnt + cnt(nums[i],digit);
        }
        return cnt;
    }
    int cnt(int a,int x){
        int cnt = 0;
        while(a!=0){
            if(x==a%10){
                cnt++;
            }
            a=a/10;
        }
        return cnt;
    }
}