class Solution {
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for(int x : prices){
            if(x<secMin){
                if(x<min){
                    secMin = min;
                    min = x;
                } else {
                    secMin = x;
                }
            }
        }
        System.out.print(min+" "+secMin);
        if(secMin+min>money){
            return money;
        }
        return money-min-secMin;
    }
}