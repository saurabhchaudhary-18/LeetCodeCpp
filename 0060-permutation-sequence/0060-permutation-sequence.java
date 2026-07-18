class Solution {
    public String getPermutation(int n, int k) {
        if(n==1){
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            sb.append(i);
        }
        int fact = 1;
        for(int i=2; i<n; i++){
            fact = fact *i;
        }
        n--;
        StringBuilder res = new StringBuilder();
        while(k>0){
            if(k%fact==0){
                res.append(sb.charAt((k/fact)-1));
                sb.deleteCharAt((k/fact)-1);
            } else {
                res.append(sb.charAt(k/fact));
                sb.deleteCharAt(k/fact);
            }
            k=k%fact;
            fact = fact/n;
            n--;
        }
        for(int i=sb.length()-1; i>=0; i--){
            res.append(sb.charAt(i));
        }
        return res.toString();
    }
}