class Solution {
    public int diagonalSum(int[][] mat) {

        int totalSum = 0;
        int size = mat.length;

        for (int row = 0; row < size; row++) 
        {
            totalSum = totalSum + mat[row][row];

            totalSum = totalSum + mat[row][size - 1 - row]; // logic to add the other diagonal elements
        }

        if (size % 2 == 1)
        {
            totalSum = totalSum - mat[size / 2][size / 2]; // logic to remove the repeated elements from totalsum
        }

        return totalSum;
    }
}
