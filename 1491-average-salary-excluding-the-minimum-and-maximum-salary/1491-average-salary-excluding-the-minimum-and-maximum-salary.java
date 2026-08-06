class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        double ans = 0;
        int max = salary[0];
        int min = max;
        for(int x : salary){
            if(x>max){
                max =x;
            }
            if(x<min){
                min = x;
            }
            ans = ans + x;
        }
        ans = ans -max-min;
        return ans/(n-2);
    }
}