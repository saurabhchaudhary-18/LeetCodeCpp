class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==2147483647){
            return false;
        }
        int i=0; 
        while(true){
            int power = (int)Math.pow(3,i++);
            if(n==power){
                return true;
            }
            if(n<power){
                return false;
            }
        }
    }
}