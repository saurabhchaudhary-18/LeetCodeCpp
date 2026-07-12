class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==2147483647){
            return false;
        }
        int i=0;
        while(true){
            int power = (int)Math.pow(2,i++);
            if(n==power){
                return true;
            }
            if(power>n){
                return false;
            }
        }
    }
}