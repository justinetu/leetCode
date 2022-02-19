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