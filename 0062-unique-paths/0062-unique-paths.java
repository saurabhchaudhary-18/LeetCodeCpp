class Solution {
    public int uniquePaths(int m, int n) {
        int[] above = new int[n];
        Arrays.fill(above,1);
        for(int i=1; i<m; i++){
            int[] down = new int[n];
            Arrays.fill(down,1);
            for(int j=1; j<n; j++){
                down[j] = down[j-1] + above[j];
            }
            above = down;
        }
        return above[n-1];
    }
}