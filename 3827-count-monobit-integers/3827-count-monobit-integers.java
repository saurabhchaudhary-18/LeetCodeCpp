class Solution {
    public int countMonobit(int n) {
        int cnt = 0;
        for(int i=0; i<=n; i++){
            if(monobit(i)){
                cnt++;
            }
        }
        return cnt;
    }
    boolean monobit(int a){
        int d = a%2;
        while(a!=0){
            int digit = a%2;
            if(digit!=d){
                return false;
            }
            a=a/2;
        }
        return true;
    }
}