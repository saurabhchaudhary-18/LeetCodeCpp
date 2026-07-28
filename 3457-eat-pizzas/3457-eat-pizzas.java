class Solution {
    public long maxWeight(int[] pizzas) {
        long ans = 0;
        long total = pizzas.length/4;
        long odd = (total+1)/2;
        Arrays.sort(pizzas);
        for(int i=pizzas.length-1, d=1; d<=total; --i, ++d){
            if(d>odd){
                --i;
            }
            ans = ans + (long)pizzas[i];
        }
        return ans;
    }
}