public class Solution {

    public int uniquePathsWithObstacles(int[][] OG) {
        if (OG[0][0] == 1) return 0;
        OG[0][0] = 1;
        int m = OG.length;
        int n = OG[0].length;
        for (int i = 1; i < m; i++) {
            if (OG[i][0] == 1) {
                OG[i][0] = 0;
            } else {
                OG[i][0] = OG[i - 1][0];
            }
        }
        for (int j = 1; j < n; j++) {
            if (OG[0][j] == 1) {
                OG[0][j] = 0;
            } else {
                OG[0][j] = OG[0][j - 1];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (OG[i][j] == 1) {
                    OG[i][j] = 0;
                } else {
                    OG[i][j] = OG[i - 1][j] + OG[i][j - 1];
                }
            }
        }
        return OG[m - 1][n - 1];
    }
}