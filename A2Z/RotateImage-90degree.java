//non optimal; not inplace
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];

        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n; j++) {
                //kuthya posi var assign kartoy
                ans[j][n-1-i] = matrix[i][j];
            }
        }
        //we can but remember you cant directly use it for 2D array, use loop!! 
        for (int i = 0; i < n; i++) {
            System.arraycopy(ans[i], 0, matrix[i], 0, n);
        }    
    }
}
