class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> answer = new ArrayList<>(); //list to store answer elements

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        // variables for four ends of the matrix

        while (top <= bottom && left <= right) { // loop for traversing all elements once

            // Left to Right
            for (int col = left; col <= right; col++)
            {
                answer.add(matrix[top][col]);
            }
            top++;

            // Top to Bottom
            for (int row = top; row <= bottom; row++) 
            {
                answer.add(matrix[row][right]);
            }
            right--;

            // Right to Left
            if (top <= bottom) 
            {
                for (int col = right; col >= left; col--) 
                {
                    answer.add(matrix[bottom][col]); 
                }
                bottom--;
            }

            // Bottom to Top
            if (left <= right) 
            {
                for (int row = bottom; row >= top; row--) 
                {
                    answer.add(matrix[row][left]);
                }
                left++;
            }
        }

        return answer;
    }
}
