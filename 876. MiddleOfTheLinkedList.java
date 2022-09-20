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

/*
 Solution
 My approach is to first traverse the list to count the number of nodes then I'll traverse the list a second time AND I'll keep track
 of each nodes index and I'll create a condition that asks if the index at the current node is equal the number of nodes in the list divided 
 by 2, this will work for both cases of whether the list contains 1 or 2 middle numbers. Java does integer division which was useful for me in
 solving this.
*/
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
