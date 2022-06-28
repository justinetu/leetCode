/* Question

Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, 
which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
*/

//Solution

class romanToInteger {
    public int romanToInt(String s) {
        int intConversion = 0;
        HashMap<Character, Integer> rn = new HashMap<>();
        rn.put('I', 1); rn.put('V', 5); rn.put('X', 10); rn.put('L', 50); rn.put('C', 100); rn.put('D', 500);
        rn.put('M', 1000);
        int i = 0;
        while(i < s.length()) {
            if(i != s.length() - 1) {
                if(rn.get(s.charAt(i)) < rn.get(s.charAt(i + 1))) {
                    intConversion = (rn.get(s.charAt(i+1))-rn.get(s.charAt(i))) + intConversion;
                    ++i;
                    ++i;
                    if(i >= s.length())
                        break;
                }
                else {
                    intConversion = intConversion + rn.get(s.charAt(i));
                    ++i;
                }
            }
            else {
                intConversion = intConversion + rn.get(s.charAt(i));
                ++i;
            }
        }
        return intConversion;
    }
}
