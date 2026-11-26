class Solution {
    public boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        boolean flag = true;
        for(int i=10; i>=0; i--){
            flag = !flag;
            n=n-i;
            if(n<0){
                break;
            }
        }
        return flag;
    }
}