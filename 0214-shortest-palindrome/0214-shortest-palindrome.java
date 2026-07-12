class Solution {
    public String shortestPalindrome(String s) {
        int count = pm(new StringBuilder(s).reverse().toString(), s);
        return new StringBuilder(s.substring(count)).reverse().toString() +s;
    }
    protected int pm(String text, String pent){
        String newString = pent + '#' +text;
        int[] str = new int[newString.length()];
        int i=1;
        int k=0;
        while(i<newString.length()){
            if(newString.charAt(i) == newString.charAt(k)){
                k++;
                str[i] = k;
                i++;
            } else{
                if(k>0){
                    k = str[k-1]; 
                } else {
                    str[i] = 0;
                    i++;
                }
            }
        } 
        return str[newString.length() -1];
    }
}