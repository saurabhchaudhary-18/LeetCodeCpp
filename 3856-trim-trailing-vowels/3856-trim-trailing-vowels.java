class Solution {
    public String trimTrailingVowels(String s) {
        if(s.length()==0){
            return "";
        }
        while(check(s.charAt(s.length()-1))){
            s=s.substring(0,s.length()-1);
            if(s.length()==0){
                return "";
            }
        }
        return s;
    }
    boolean check(char ch){
        String s = "aeiou";
        for(int i=0; i<5; i++){
            if(ch==s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}