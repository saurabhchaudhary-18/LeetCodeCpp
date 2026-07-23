class Solution {
    public int maxDistinct(String s) {
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        int cnt = 0;
        for(int x: arr){
            if(x!=0){
                cnt++;
            }
        }
        return cnt;
    }
}