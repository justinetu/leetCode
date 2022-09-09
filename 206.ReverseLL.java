/*
  Given the head of a singly linked list, reverse the list, and return the reversed list.
  Input: head = [1,2,3,4,5]
  Output: [5,4,3,2,1]  
*/

class ReverseLL {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head, prev = null, next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
