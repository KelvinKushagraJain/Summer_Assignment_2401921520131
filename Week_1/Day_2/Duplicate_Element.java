    import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] arr) {

        HashSet<Integer> mySet = new HashSet<>();
        // New hashset defined for storing the Array Elements
        for (int i = 0; i < arr.length; i++) 
        {

            if (mySet.contains(arr[i])) 
            {
                return true;
            }

            mySet.add(arr[i]);
        }

        return false;
    }
}
