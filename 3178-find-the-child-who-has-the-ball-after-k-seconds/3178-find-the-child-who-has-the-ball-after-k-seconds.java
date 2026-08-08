class Solution {
    public int numberOfChild(int n, int k) {
        n--;
        int r = k/n;
        int rem = k%n;
        if(r%2==0){
            return rem;
        } else {
            return n-rem;
        }
    }
}