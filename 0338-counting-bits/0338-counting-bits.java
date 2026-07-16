class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0; i<n+1; i++){
            arr[i] = count(i);
        }
        return arr;
    }
    public static int count(int a){
        int cnt = 0;
        while(a!=0){
            if(a%2==1){
                cnt++;
            }
            a=a/2;
        }
        return cnt;
    }
}