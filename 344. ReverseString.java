/*
  Question
  Write a function that reverses a string. The input string is given as an array of characters s.
  You must do this by modifying the input array in-place with O(1) extra memory.
  Example 1:
  Input: s = ["h","e","l","l","o"]
  Output: ["o","l","l","e","h"]
  */

// My solution
class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp = ' ';
        while(left < right) {
            temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            ++left;
            --right;
        }
    }
}

/*
    In my solution I first create two variables that will serve as indexes in my array. Left starts at the beginning of the array and right at the end.
    I created a temp variable so that I don't lose the element at the left index when swapping with the element at the right index. Then all I do is 
    loop and create a condition that where left has to be less than right and the I simply just swap the elements until the indexes are equivalent 
    incrementing left and decrementing right with each iteration. Time complexity is O(N) whereas the space complexity is O(1).
*/
