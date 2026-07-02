class Solution {
    public int digitFrequencyScore(int n) {
        int[] arr = new int[10];
        while(n!=0){
            int digit = n%10;
            arr[digit]++;
            n=n/10;
        }
        int sum = 0;
        for(int i=0; i<10; i++){
            sum = sum + i*arr[i];
        }
        return sum;
    }
}