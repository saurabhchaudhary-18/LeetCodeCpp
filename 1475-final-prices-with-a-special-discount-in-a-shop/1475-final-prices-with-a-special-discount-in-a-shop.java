class Solution {
    public int[] finalPrices(int[] prices) {
        int[] arr = new int[prices.length];
        int n = prices.length;
        for(int i=0; i<n; i++){
            arr[i] = discount(prices,i);
        }
        return arr;
    }
    public static int discount(int[] arr, int a){
        int x = arr[a];
        for(int i=a+1; i<arr.length; i++){
            if(arr[i]<=x){
                return x-arr[i];
            }
        }
        return x;
    }
}