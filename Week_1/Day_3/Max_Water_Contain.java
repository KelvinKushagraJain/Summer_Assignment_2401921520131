class Solution {
    public int maxArea(int[] height) {

        int start = 0;
        int end = height.length - 1;

        int maxArea = 0;

        while (start < end) 
        {

            int wide = end -start;

            int smallerHeight;

            if (height[start] < height[end]) 
            {
                smallerHeight = height[start];
            } 
            else 
            {
                smallerHeight = height[end];
            }

            int currentArea = wide*smallerHeight;

            if (currentArea > maxArea) // comparing the two areas
            {
                maxArea = currentArea;
            }

            if (height[start] < height[end])
            {
                start = start + 1;
            } else 
            {
                end = end - 1;
            }
        }

        return maxArea;
    }
}
