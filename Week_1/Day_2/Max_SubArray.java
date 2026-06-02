 class Solution {
    public int maxSubArray(int[] arr)
     {
    // prfrSum = preferred sum
        int prfrSum = arr[0];
        int currentSum = arr[0];

        for (int pos = 1; pos < arr.length; pos++) 
        {
            if (currentSum <0) // if current sum is negative, discard it and assign current element value to current sum
            {
                currentSum =arr[pos];
            }
            else 
            {
                currentSum = currentSum +arr[pos];
            }

            if (currentSum > prfrSum) 
            {
                prfrSum =currentSum;
            }
        }

        return prfrSum;
    }
}
