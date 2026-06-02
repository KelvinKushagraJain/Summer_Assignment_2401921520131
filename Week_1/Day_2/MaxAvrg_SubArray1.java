   class Solution {
    public double findMaxAverage(int[] arr, int k) {

        int currentSum = 0;

        for (int i = 0; i < k; i++)
        {
            currentSum =currentSum + arr[i];
        }

        int largestSum = currentSum;

        for (int i = k; i <arr.length; i++) 
        {

            currentSum = currentSum + arr[i];

            currentSum = currentSum - arr[i - k];
            // here we add next element and subtract the previous element from the current sum

            if (currentSum >largestSum)
            { 
                largestSum = currentSum;
            }
        }

        return (double) largestSum / k;
    }
}
