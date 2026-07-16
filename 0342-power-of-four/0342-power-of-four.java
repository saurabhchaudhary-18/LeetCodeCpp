class Solution {
    public boolean isPowerOfFour(int n) {
        int count = 0;
        if(n==2147483647){
            return false;
        }
        while(true){
            int temp = (int)Math.pow(4,count++);
            if(n==temp){
                return true;
            }
            if(n<temp){
                return false;
            }
        }
    }
}