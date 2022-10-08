/*
  Question
  Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
  Input: head = [1,2,2,1]
  Output: true
*/

// Just to be clear this is not my solution. I have posted it below this solution that I got from leetCode.
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
      
        List<Integer> listVals = new ArrayList<>();
        int left, right;
        while(head != null) {
            listVals.add(head.val);
            head = head.next;
        }
        left = 0;
        right = listVals.size() - 1;
        while(left < right) {
            if(!listVals.get(left).equals(listVals.get(right)))
                return false;
            ++left;
            --right;
        }
        return true;
    }
}

/*
  Here is my solution which is incorrect because accessing nodes takes O(n) time whereas with the above solution, using two pointers to access elements in the array
  takes O(1). We simply use the two pointer technique to compare each element checking if they're equal until we get to the middle.

  class SolPalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
      String s1 = "";
      String s2 = "";
      char ch;
      int i = 0;
      while(head != null) {
          s1 += head.val;
          ch = s1.charAt(i);
          s2 = ch + s2;
          head = head.next;
          i++;
      }
      if(s1.equals(s2))
          return true;
      return false;
    }
  }
*/
