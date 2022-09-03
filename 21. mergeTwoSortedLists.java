class mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                dummy.next = list1;
                list1 = list1.next;
            }
            else {
                dummy.next = list2;
                list2 = list2.next;
            }
            dummy = dummy.next;
        }
        if(list1 == null)
            dummy.next = list2;
        else
            dummy.next = list1;
        return head.next;
    }
}

// FYI this solution is not mine. I got it online.
