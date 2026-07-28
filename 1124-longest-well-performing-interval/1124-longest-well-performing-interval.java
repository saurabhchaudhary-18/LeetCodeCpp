class Solution {
    public int longestWPI(int[] hours) {
        int ans = 0;
        int n = hours.length;
        for(int i=0; i<n; i++){
            int len = 0;
            int cnt = 0;
            for(int j=i; j<n; j++){
                len++;
                if(hours[j]>8){
                    cnt++;
                } else {
                    cnt--;
                }
                if(cnt>0){
                    ans = Math.max(ans,len);
                }
            }
        }
        return ans;
    }
}