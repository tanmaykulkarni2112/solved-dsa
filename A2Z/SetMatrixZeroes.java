//check more optimal logic
class Solution {
    public int[][] setZeroes(int[][] matrix) {
        int xfactor = matrix.length;
        int yfactor = matrix[0].length; 
        boolean[][] zeroMarks = new boolean[xfactor][yfactor];

        for (int i = 0; i < xfactor; i++){
            for (int j = 0; j < yfactor; j++){
                if (matrix[i][j] == 0){
                    zeroMarks[i][j] = true;
                }
            }
        }

        for (int i = 0; i < xfactor; i++) {
            for (int j = 0; j < yfactor; j++) {
                if (zeroMarks[i][j]){
                    for (int k = 0; k < yfactor; k++){
                        matrix[i][k] = 0;
                    }
                    for (int k = 0; k < xfactor; k++){
                        matrix[k][j] = 0;
                    }
                }
            }
        }

        return matrix;        
    }
}
