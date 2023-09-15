'''
  For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

  Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
  
   
  
  Example 1:
  
  Input: str1 = "ABCABC", str2 = "ABC"
  Output: "ABC"
  Example 2:
  
  Input: str1 = "ABABAB", str2 = "ABAB"
  Output: "AB"
  Example 3:
  
  Input: str1 = "LEET", str2 = "CODE"
  Output: ""
'''

#Solution
class Solution(object):
    def gcdOfStrings(self, str1, str2):
        if str1[0] != str2[0]:
            return ""
        if len(str2) > len(str1):
            temp = str1
            str1 = str2
            str2 = temp
        ptr = len(str2)
        x = str2[:ptr]
        while len(str1) % len(x) != 0 or len(str2) % len(x) != 0:
            ptr -= 1
            x = str2[:ptr]
        str1_quotient = len(str1) / len(x)
        str2_quotient = len(str2) / len(x)
        if x * str1_quotient == str1 and x * str2_quotient == str2:
            return x
        return ""
