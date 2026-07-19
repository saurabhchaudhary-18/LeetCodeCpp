class Solution {
    public boolean canReach(int[] start, int[] target) {
        int cnt =0;
        cnt = cnt + (int)Math.abs(start[0]-target[0]);
        cnt = cnt + (int)Math.abs(start[1]-target[1]);
        return cnt%2==0;
    }
}