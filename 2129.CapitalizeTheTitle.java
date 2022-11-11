/*
  Question
  
  You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:

  If the length of the word is 1 or 2 letters, change all letters to lowercase.
  Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
  Return the capitalized title.

 

  Example 1:

  Input: title = "capiTalIze tHe titLe"
  Output: "Capitalize The Title"
  Explanation:
  Since all the words have a length of at least 3, the first letter of each word is uppercase, and the remaining letters are lowercase.
*/

// Answer
import java.lang.StringBuilder;

class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder result = new StringBuilder();
        String[] str = title.split(" ");
        char c;
        String cap, cut;
        if(title.length() <= 2)
            return title.toLowerCase();
        for(String s: str) {
            if(s.length() > 2) {
                s = s.toLowerCase();
                c = Character.toUpperCase(s.charAt(0));
		        cap = s.substring(0, 1).toUpperCase();
		        cut = s.substring(1, s.length());
		        result.append(cap + cut + " ");
            }
            else{
                s = s.toLowerCase();
                result.append(s + " ");
            }
        }
        result.setLength(result.length() - 1);
        return result.toString();
    }
}
