class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        String pre = strs[0];
        int prel = pre.length();
        for(int i=1; i<strs.length; i++){
            String str = strs[i];
            while(prel>str.length() || !pre.equals(str.substring(0,prel))){
                prel--;
                if(prel==0){
                    return "";
                }
                pre = pre.substring(0,prel);
            }
        }
        return pre;
    }
}