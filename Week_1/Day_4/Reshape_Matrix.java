  class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) 
        {
            return mat;  // reshaping is not possible, elemnts are not same
        }

        int[][] newMat = new int[r][c];

        int pos = 0;

        for (int i = 0; i < rows; i++) 
        {

            for (int j = 0; j < cols; j++) 
            {
                newMat[pos / c][pos % c] = mat[i][j]; // logic to place the element in correct position

                pos = pos + 1;
            }
        }

        return newMat;
    }
}
