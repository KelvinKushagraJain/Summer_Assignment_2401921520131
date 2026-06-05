class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {  

           // logic to swap string characters
            char temp = s[left];
            s[left] = s[right];  
            s[right] = temp;

            left++;
            right--;
        }
    }
}
