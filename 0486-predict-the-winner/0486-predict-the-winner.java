class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        if(n==1){
            return true;
        }
        int[][]  dp = new int[n][n];
        for(int [] arr : dp){
            Arrays.fill(arr,-1);
        }
        return max(0,n-1,nums,dp)>=0;
    }
    int max(int i, int j, int[] arr, int[][] dp){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(i==j){
            return dp[i][j] = arr[i];
        }
        return dp[i][j] = Math.max(arr[i]-max(i+1,j,arr,dp),arr[j]-max(i,j-1,arr,dp));
    }
}