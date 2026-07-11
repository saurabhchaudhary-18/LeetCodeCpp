class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int carry = 0;
        int i = ac.length-1;
        int j = bc.length-1;
        while(i>=0 || j>=0 || carry>0){
            int an = 0;
            if(i>=0){
                an = ac[i]-'0';
            } 
            int bn = 0;
            if(j>=0){
                bn = bc[j]-'0';
            }
            i--;
            j--;
            int sum = an + bn + carry;
            carry = sum/2;
            int digit = sum%2;
            sb.append((char)(digit+'0'));
        }
        return sb.reverse().toString();
    }
}