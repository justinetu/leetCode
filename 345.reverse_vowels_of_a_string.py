'''
  Given a string s, reverse only all the vowels in the string and return it.

  The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once

  Example 1:

  Input: s = "hello"
  Output: "holle"
  Example 2:
  
  Input: s = "leetcode"
  Output: "leotcede"
'''
class Solution(object):
    def reverseVowels(self, s):
        vowels = {'a','e','i','o','u','A','E','I','O','U'}
        a_list = list(s)
        left = 0
        right = len(a_list) - 1
        while left < right:
            if a_list[left] in vowels and a_list[right] in vowels:
                temp = a_list[left]
                a_list[left] = a_list[right]
                a_list[right] = temp
                left += 1
                right -= 1
            elif a_list[left] in vowels:
                right -= 1
            elif a_list[right] in vowels:
                left += 1
            else: left += 1
        return ''.join(a_list)

# Run time is O(n) since we traverse the entire list
