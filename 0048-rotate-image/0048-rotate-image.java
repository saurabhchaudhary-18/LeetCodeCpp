class Solution {
    public void rotate(int[][] matrix) {
        int e = matrix.length;
        int top = 0;
        int bottom = e-1;
        while(top<bottom){
            for(int col = 0; col<e; col++){
                int t = matrix[bottom][col];
                matrix[bottom][col] = matrix[top][col];
                matrix[top][col] = t;
            }
            top++;
            bottom--;
        }
        for(int row = 0; row<e; row++){
            for(int col = row+1; col<e; col++){
                int t = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = t;
            }
        }
    }
}