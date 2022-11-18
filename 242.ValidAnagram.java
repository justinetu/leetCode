/*
  Question
  Given two strings s and t, return true if t is an anagram of s, and false otherwise.

  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

 Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/

// Answwer
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] arr1 = new char[s.length()];
        char[] arr2 = new char[t.length()];
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = s.charAt(i);
            arr2[i] = t.charAt(i);
        }
        Arrays.sort(arr1);
        String s1 ="";
        String s2 = "";
        for(char i : arr1)
            s1+=i;

        Arrays.sort(arr2);
        for(char c : arr2) {
            s2+=c;
        }
        return s1.equals(s2);
    }
  
  /*
  Basically for my solution what I do is I add both strings to character arrays then sort both arrays by unicode then append the characters in each array
  to strings then lastly, I check to see if the strings are equal. If they are, anagram and if not, not an anagram. I also solved this problem using the 
  StringBuilder class in java in order to write less code.
  */
