class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int k = vow(arr[0]);
        String result = arr[0]+" ";
        for(int i=1; i<arr.length; i++){
            if(vow(arr[i])==k){
                result = result +  rev(arr[i])+" ";
            } else {
                result =result + arr[i]+" ";
            }
        }
        return result.trim();
    }
    int vow(String s){
        String vowel = "aeiou";
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(vowel.contains(s.charAt(i)+"")){
                cnt++;
            }
        }
        return cnt;
    }
    String rev(String s){
        String r = "";
        for(int i=s.length()-1; i>=0; i--){
            r=r+s.charAt(i);
        }
        return r;
    }
}