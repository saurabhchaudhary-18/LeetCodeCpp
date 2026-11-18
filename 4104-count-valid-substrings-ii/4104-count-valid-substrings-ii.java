class Solution {
    public long countValidSubstrings(String s) {
        int a = -1;
        int b = -1;
        int c = -1;
        long res = 0;
        for(int i=0; i<s.length(); ++i){
            char ch = s.charAt(i);
            if(ch=='a'){
                a=i;
            } else if(ch=='b'){
                b=a;
            } else{
                c=b;
            }
            res = res +(i-c);
        }
        return res;
    }
}