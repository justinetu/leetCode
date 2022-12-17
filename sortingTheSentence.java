/*
  Question
  A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.

  A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.

  For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
  Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.

 

  Example 1:

  Input: s = "is2 sentence4 This1 a3"
  Output: "This is a sentence"
  Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
*/
import java.util.ArrayList;
import java.util.Collections;

class sortingTheSentence {
    public String sortSentence(String s) {
	// Split the string by space
        String[] words = s.split(" ");
        ArrayList<Character> list = new ArrayList<>();
	    
	// Exracting each number from the string and putting it in a list
        for(String word : words) {
            list.add(word.charAt(word.length() - 1));
        }
	    
	// Created a string called concat that we'll use to append each word with a space
        String concat = "";
	ArrayList<String> sentence = new ArrayList<>();    
	    
	 // Sorting the list of numbers which are characters
	Collections.sort(list);
	    
	// Here we just compare the numbers in the sorted list to the numbers in the original sentence. If the number at the given index is equal
	// to the number in the string, then we append that word to concat. It will concatenate the strings based on the order of the numbers in list.
	for(int i = 0; i < words.length; i++) {
		for(int j = 0; j < words.length; j++) {
		    if(list.get(i) == words[j].charAt(words[j].length() - 1)) {
		    concat+= words[j].substring(0, words[j].length() - 1) + ' ';
		    sentence.add(words[j]);
		}
	}
	}
	    
	// We want to ignore the trailing space so we use substring to remove it
        return concat.substring(0, concat.length() - 1);
    }
}
