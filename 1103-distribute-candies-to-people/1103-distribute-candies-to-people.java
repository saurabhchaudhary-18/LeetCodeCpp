class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        for(int i=0; candies>0; candies-=i){
            arr[i%num_people] += Math.min(candies,++i);
        }
        return arr;
    }
}