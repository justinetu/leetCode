/*Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
*/

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = "" + x;
	    String str2 = "";
	    boolean expression = false;
	   
	    for(int i = str.length() - 1; i >= 0; i--) {
	        str2 = str2 + str.charAt(i);
	    }
	    
	    int y = str2.length() - 1;
	    
	    if(str2.charAt(y) == '-') {
	        return expression;
	    }
	    
	    
	    Long reverse = Long.parseLong(str2);
	    
	    if(x == reverse) {
	        return true;
	    }
	    return false;
    }
}
