class Solution {
    public boolean canConvertString(String s, String t, int k) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i<s.length(); i++){
            int d = (t.charAt(i)-s.charAt(i)+26)%26;
            if(d>0 && d+count[d]*26>k){
                return false;
            }
            count[d]++;
        }
        return true;
    }

}