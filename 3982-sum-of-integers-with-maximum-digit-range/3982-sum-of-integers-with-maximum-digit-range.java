class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int max = 0;
        int sum =0;
        for(int i=0; i<n; i++){
            arr[i] = range(nums[i]);
            if(max<arr[i]){
                max = arr[i];
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i]==max){
                sum = sum + nums[i];
            }
        }
        return sum;
    }
    int range(int a){
        int max = 0;
        int min = 10;
        while(a!=0){
            int digit = a%10;
            if(max<digit){
                max = digit;
            }
            if(min>digit){
                min = digit;
            }
            System.out.print(digit);
            a=a/10;
        }
        System.out.println(max+" "+min);
        return max-min;
    }
}