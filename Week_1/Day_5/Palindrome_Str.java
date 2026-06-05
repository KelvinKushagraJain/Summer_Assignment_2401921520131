class Solution {
    public boolean isPalindrome(String s) {

        String newStr = "";  // new newStr string to store only alphanumeric characters

        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) 
            {
                newStr += Character.toLowerCase(ch);  // changing to lowercase and adding to new string
            }
        }

        int left = 0;
        int right = newStr.length() - 1;  // defining the two pointers

        while (left < right) 
        {

            if (newStr.charAt(left) != newStr.charAt(right)) 
            {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
