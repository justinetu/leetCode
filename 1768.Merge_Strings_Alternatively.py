'''
  You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
  If a string is longer than the other, append the additional letters onto the end of the merged string.

  Return the merged string.

  Example 1:

  Input: word1 = "abc", word2 = "pqr"
  Output: "apbqcr"
  Explanation: The merged string will be merged as so:
  word1:  a   b   c
  word2:    p   q   r
  merged: a p b q c r
  Example 2:

  Input: word1 = "ab", word2 = "pqrs"
  Output: "apbqrs"
  Explanation: Notice that as word2 is longer, "rs" is appended to the end.
  word1:  a   b 
  word2:    p   q   r   s
  merged: a p b q   r   s
'''

# Solution
class Solution(object):
    def mergeAlternately(self, word1, word2):
        str1_ptr = 0
        str2_ptr = 0
        merged = ""
        if len(word1) == len(word2):
            while str1_ptr <= len(word1) - 1 or str2_ptr <= len(word2) - 1:
                merged += word1[str1_ptr]
                merged += word2[str2_ptr]
                str1_ptr += 1
                str2_ptr += 1
        else:
            while str1_ptr <= len(word1) - 1 and str2_ptr <= len(word2) - 1:
                merged += word1[str1_ptr]
                merged += word2[str2_ptr]
                str1_ptr += 1
                str2_ptr += 1
            if str1_ptr == len(word1):
                merged += word2[str2_ptr:]
            else: merged += word1[str1_ptr:]
        return merged
