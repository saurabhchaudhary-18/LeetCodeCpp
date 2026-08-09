class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int j=discounts.length-1;
        double ans = 0;
        for(int i=prices.length-1; i>=0; i--){
            if(j==-1){
                ans = ans + prices[i];
            } else {
                double p = (double)prices[i]*(100-discounts[j])/100;
                System.out.print(p+" ");
                ans = ans + p;
                j--;
            }
        }
        return ans;
    }
}