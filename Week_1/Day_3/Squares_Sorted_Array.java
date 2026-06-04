class Solution {
    public int[] sortedSquares(int[] arr) {

        int[] result = new int[arr.length];

        int first = 0;
        int last = arr.length - 1;
        int pos = arr.length - 1;

        while (first <= last) 
        {

            int firstValue = arr[first]*arr[first];
            int lastValue = arr[last]*arr[last];

            if (firstValue > lastValue) // here we are comparing the squared values
            {
                result[pos] = firstValue;
                first = first + 1;

            } 
            else 
            {
                result[pos] = lastValue;
                last = last - 1;
            }

            pos = pos - 1;
        }

        return result;
    }
}
