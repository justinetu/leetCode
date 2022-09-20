/*
 Given the head of a singly linked list, return the middle node of the linked list.

 If there are two middle nodes, return the second middle node.
 
 Example 1:
 Input: head = [1,2,3,4,5]
 Output: [3,4,5]
 Explanation: The middle node of the list is node 3.

 Input: head = [1,2,3,4,5,6]
 Output: [4,5,6]
 Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
*/

//Solution
class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null)
            return head;
        int numOfNodes = 0;
        int index = 0;
        ListNode curr = head;
        while(head != null) {
            ++numOfNodes;
            head = head.next;
        }
        while(curr != null) {
            if(index == numOfNodes/2)
                return curr;
            curr = curr.next;
            ++index;
        }
        return head;
    }
}
