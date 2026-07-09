class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        for(int i=0; i<capacity.length; i++){
            capacity[i] = capacity[i]-itemSize;
        }
        int min = Integer.MAX_VALUE;
        int ind = -1;
        for(int i=0; i<capacity.length; i++){
            if(capacity[i]<min && capacity[i]>=0){
                min = capacity[i];
                ind = i;
            }
        }
        return ind;
    }
}