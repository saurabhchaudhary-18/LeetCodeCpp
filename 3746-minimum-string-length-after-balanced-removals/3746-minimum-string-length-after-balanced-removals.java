class Solution {
    public int minLengthAfterRemovals(String s) {
        int a = 0;
        int b = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                a++;
            } else {
                b++;
            }
        }
        return diff(a,b);
    }
    int diff(int a, int b){
        if(a<b){
            return b-a;
        } else {
            return a-b;
        }
    }
}